package com.example.Wansoft.Survey

import Models.*
import ServiceManager.ServiceManager
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.app_bar_home.*
import kotlinx.android.synthetic.main.content_home.*
import android.widget.Toast
//import com.google.zxing.client.android.CaptureActivity
import android.app.DatePickerDialog
import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.vicpin.krealmextensions.*
import org.jetbrains.anko.alert
import java.text.SimpleDateFormat
import java.util.*
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.R
import com.google.zxing.integration.android.IntentIntegrator
import com.vicpin.krealmextensions.queryFirst
import org.jetbrains.anko.*


class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    var encuestasGuardadas = listOf<EncuestaModel>()
    var encuestaSeleccionada:EncuestaModel? = null
    var datePicker:DatePickerDialog? = null
    var inputName: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        this.getEncuestasGuardadas()
        this.getEncuestasPendientes()

        val lightFont: Typeface = Typeface.createFromAsset(assets, "fonts/graphik_light.ttf")
        val regularFont: Typeface = Typeface.createFromAsset(assets, "fonts/graphik_regular.ttf")
        encuestaTitulo.typeface = regularFont
        titleText.typeface = regularFont
        codigoTextField.typeface = lightFont
        iniciarButton.typeface = regularFont
        codigoButton.typeface = regularFont
        fechaOrdenButton.typeface = regularFont

        SharedData.SharedInstance.fechaOrden = Date()

        if(SharedData.SharedInstance.codigoOpcional == false){
            fechaOrdenButton.isEnabled = false
            codigoTextField.isEnabled = false
        }else{
            fechaOrdenButton.isEnabled = true
            codigoTextField.isEnabled = true
        }

        /*var toggle = object : ActionBarDrawerToggle(this,
            drawer_layout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        ) {
            override fun onDrawerOpened(drawerView: View) {

                super.onDrawerOpened(drawerView)
                this@HomeActivity.hideKeyboard(this@HomeActivity)
            }
        }

        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()*/

        val menuButton = findViewById<Button>(R.id.menuButton)
        menuButton.setOnClickListener {
            /*alert {
                title = "Title"
                message = "Message"

                customView {
                    inputName = editText {
                        hint = "Código de sucursal:"
                    }
                }

                positiveButton("Aceptar"){
                    drawer_layout.openDrawer(GravityCompat.START)
                }
            }.show()*/
            alert("Introduce el id de sucursal para ingresar a la configuración") {
                title = "Sucursal"
                customView {
                    inputName = editText {
                        padding = dip(22)
                        hint = "Código de sucursal:"
                    }
                }
                positiveButton("Aceptar"){
                    val login = LoginModel().queryFirst()
                    val codigo = inputName?.text.toString()
                    if(codigo == login!!.idSucursal) {
                        drawer_layout.openDrawer(GravityCompat.START)
                    }else{
                        alert("Necesitas el id de la sucursal para ingresar a la configuración"){
                            positiveButton("Aceptar"){}
                        }.show().apply {
                            getButton(AlertDialog.BUTTON_POSITIVE)?.let {it.setTextColor(Color.parseColor("#3E4883"))}
                        }
                    }
                }
                negativeButton("Cancelar"){}
            }.show().apply {
                getButton(AlertDialog.BUTTON_POSITIVE)?.let { it.setTextColor(Color.parseColor("#3E4883")) }
                getButton(AlertDialog.BUTTON_NEGATIVE)?.let { it.setTextColor(Color.parseColor("#FF0000")) }
            }
        }

        nav_view.setNavigationItemSelectedListener(this)

        codigoButton.setOnClickListener {
            val integrator = IntentIntegrator(this)
            integrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES)
            integrator.setPrompt("Escaneando código...");
            integrator.setCameraId(0);
            integrator.setBeepEnabled(false);
            integrator.setBarcodeImageEnabled(true);
            integrator.setBarcodeImageEnabled(true);
            integrator.initiateScan();
        }

        iniciarButton.setOnClickListener {
            if(codigoTextField.text.toString() != ""){
                if(this.encuestaSeleccionada == null){
                    alert("No hay encuesta seleccionada, verifica que haya encuestas asociadas y selecciona una.") {
                        title = "Aviso"
                        positiveButton("Aceptar") {}
                    }.show().apply {
                        getButton(android.support.v7.app.AlertDialog.BUTTON_POSITIVE)?.let { it.setTextColor(Color.parseColor("#3E4883")) }
                    }
                }else {
                    SharedData.SharedInstance.numeroOrden = codigoTextField.text.toString()
                    val intent = Intent(applicationContext, EncuestaActivity::class.java)
                    intent.putExtra("Encuesta", this.encuestaSeleccionada)
                    startActivity(intent)
                    codigoTextField.setText("")
                }
            }else{
                codigoTextField.setError("Introduce número de orden")
            }
        }
    }

    override fun onPause() {
        super.onPause()
        codigoTextField.setText("")
        SharedData.SharedInstance.fechaSeleccionada = Date()
    }

    override fun onResume() {
        super.onResume()
        codigoTextField.clearFocus()
        this.encuestaSeleccionada = intent.getParcelableExtra("Encuesta")

        this.getEncuestasGuardadas()

        val currentDate = SharedData.SharedInstance.fechaSeleccionada
        val format = SimpleDateFormat("dd-MMM-yyyy")
        val fechaTexto = format.format(currentDate)
        fechaOrdenButton.setText(fechaTexto)

        val calendar = this.getCurrentDate()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        this.datePicker = DatePickerDialog(this, R.style.DatePicker, DatePickerDialog.OnDateSetListener(){
                view, year, monthOfYear, dayOfMonth ->
            val calendar = Calendar.getInstance()
            calendar.set(year, monthOfYear, dayOfMonth)
            val fecha = calendar.time
            SharedData.SharedInstance.fechaOrden = calendar.time
            SharedData.SharedInstance.fechaSeleccionada = calendar.time
            val fechaTexto = format.format(fecha)
            fechaOrdenButton.setText(fechaTexto)
        }, year, month, day)
    }

    override fun onRestart() {
        super.onRestart()
        this.getEncuestasPendientes()
        if(SharedData.SharedInstance.codigoOpcional == false){
            fechaOrdenButton.isEnabled = false
            codigoTextField.isEnabled = false
        }else{
            fechaOrdenButton.isEnabled = true
            codigoTextField.isEnabled = true
        }
    }

    fun getCurrentDate():Calendar{
        val calendar = Calendar.getInstance()
        calendar.time = SharedData.SharedInstance.fechaSeleccionada
        return calendar
    }
    fun showDatePicker(view:View){
        this.datePicker!!.show()
    }

    fun getEncuestasPendientes() {
        val encuestasPendientes = EncuestaBO().queryAll()
        if(encuestasPendientes.count() > 0){
            for(encuesta in encuestasPendientes){
                val respuestas = EncuestaRespuestas().query { equalTo("idEncuestaBO", encuesta.Id) }
                val manager = ServiceManager()
                manager.enviarEncuesta(encuesta, respuestas, this){
                    if(it != null) {
                        EncuestaRespuestas().deleteAll()
                        EncuestaBO().deleteAll()
                    }
                }
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @Override
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null) {
            if(result.contents == null) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
            } else {
                val codigoText = result.contents.takeLast(4)
                val fechaText = result.contents.take(8)
                val diaMesText = fechaText.takeLast(4)
                val añoText = fechaText.take(4)
                val mesText = diaMesText.take(2)
                val diaText = diaMesText.takeLast(2)
                val textDate = añoText+"-"+mesText+"-"+diaText
                val format = SimpleDateFormat("yyyy-MM-dd")
                val date = format.parse(textDate)

                SharedData.SharedInstance.fechaOrden = date
                SharedData.SharedInstance.fechaSeleccionada = date
                codigoTextField.setText(codigoText)
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    fun getEncuestasGuardadas(){
        val encuestaSelectGuardada = EncuestaSelectModel().queryFirst()
        if(encuestaSelectGuardada != null) {
            this.encuestaSeleccionada =
                EncuestaModel().queryFirst { equalTo("Id", encuestaSelectGuardada.idEncuesta) }
        }
        if(this.encuestaSeleccionada?.Name == null) {
            this.encuestasGuardadas = EncuestaModel().queryAll()
            val encuesta = this.encuestasGuardadas.find { it.Default == true }
            if(encuesta != null) {
                this.encuestaSeleccionada = encuesta
                encuestaTitulo.setText(encuesta?.Name)
            }else{
                encuestaTitulo.setText("No hay encuesta seleccionada")
            }
        }else{
            encuestaTitulo.setText(this.encuestaSeleccionada?.Name)
        }
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        //menuInflater.inflate(R.menu.home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            //R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_inicio -> {
                drawer_layout.closeDrawer(GravityCompat.START)
            }
            R.id.nav_encuestas -> {
                //Mostrar pantalla de encuestas
                val intent = Intent(this, EncuestasActivity::class.java)
                startActivity(intent)
                //finish()
            }
            R.id.nav_sucursal -> {
                try {
                    alert("Al cambiar de sucursal se borrará toda la información de la sucursal actual") {
                        title = "¿Deseas cambiar de sucursal?"
                        positiveButton("Aceptar"){
                            this@HomeActivity.logout()
                        }

                        negativeButton("Cancelar"){}
                    }.show().apply {
                        //getButton(AlertDialog.BUTTON_POSITIVE)?.let { it.setBackgroundColor(Color.WHITE) }
                        getButton(AlertDialog.BUTTON_POSITIVE)?.let { it.setTextColor(Color.parseColor("#3E4883")) }
                        //getButton(AlertDialog.BUTTON_NEGATIVE)?.let { it.setBackgroundColor(Color.WHITE) }
                        getButton(AlertDialog.BUTTON_NEGATIVE)?.let { it.setTextColor(Color.parseColor("#FF0000")) }
                    }

                }catch(e:Exception){
                    System.out.println(e.localizedMessage)
                }
            }
            R.id.nav_configuracion -> {
                val intent = Intent(this, ConfiguracionActivity::class.java)
                startActivity(intent)
            }
            R.id.nav_acerca -> {
                val intent = Intent(this, AcercaDeActivity::class.java)
                startActivity(intent)
                //this.finish()
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    fun logout(){
        val login = LoginModel().queryFirst()
        SharedData.SharedInstance.realmInstance.beginTransaction()
        SharedData.SharedInstance.realmInstance.deleteAll()
        SharedData.SharedInstance.realmInstance.commitTransaction()
        val intent =  Intent(this, LoginActivity::class.java)
        intent.putExtra("login", login)
        startActivity(intent)
        finish()
    }

    fun hideKeyboard(activity: Activity) {
        val inputManager = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        // check if no view has focus:
        val currentFocusedView = activity.currentFocus
        if (currentFocusedView != null) {
            inputManager.hideSoftInputFromWindow(currentFocusedView.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
        }
    }
}
