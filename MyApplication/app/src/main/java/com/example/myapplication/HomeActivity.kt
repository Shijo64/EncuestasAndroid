package com.example.myapplication

import Models.EncuestaBO
import Models.EncuestaModel
import Models.EncuestaRespuestas
import Models.EncuestaSelectModel
import ServiceManager.ServiceManager
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.app_bar_home.*
import kotlinx.android.synthetic.main.content_home.*
import android.R.attr.data
import android.widget.Toast
import com.google.zxing.client.android.CaptureActivity
import android.R.attr.data
import android.content.Context
import android.graphics.Typeface
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.vicpin.krealmextensions.*


class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    var encuestasGuardadas = listOf<EncuestaModel>()
    var encuestaSeleccionada:EncuestaModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val lightFont: Typeface = Typeface.createFromAsset(assets, "fonts/graphik_light.ttf")
        val regularFont: Typeface = Typeface.createFromAsset(assets, "fonts/graphik_regular.ttf")
        encuestaTitulo.typeface = regularFont
        titleText.typeface = regularFont
        codigoTextField.typeface = lightFont
        iniciarButton.typeface = regularFont
        codigoButton.typeface = regularFont

        if(SharedData.SharedInstance.codigoOpcional == false){
            codigoTextField.isEnabled = false
        }else{
            codigoTextField.isEnabled = true
        }

        var toggle = object : ActionBarDrawerToggle(this,
            drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close) {

            override fun onDrawerOpened(drawerView: View) {

                super.onDrawerOpened(drawerView)
                this@HomeActivity.hideKeyboard(this@HomeActivity)
            }
        }
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        this.encuestaSeleccionada = intent.getParcelableExtra("Encuesta")

        this.getEncuestasGuardadas()
        this.getEncuestasPendientes()

        codigoButton.setOnClickListener {
            this.getCodigoSucursal()
        }

        iniciarButton.setOnClickListener {
            if(codigoTextField.text.toString() != ""){
                SharedData.SharedInstance.numeroOrden = codigoTextField.text.toString()
                val intent = Intent(applicationContext, EncuestaActivity::class.java)
                intent.putExtra("Encuesta", this.encuestaSeleccionada)
                startActivity(intent)
                codigoTextField.setText("")
            }
        }
    }

    override fun onRestart() {
        super.onRestart()
        this.getEncuestasPendientes()
        if(SharedData.SharedInstance.codigoOpcional == false){
            codigoTextField.isEnabled = false
        }else{
            codigoTextField.isEnabled = true
        }
    }

    fun getEncuestasPendientes() {
        val encuestasPendientes = EncuestaBO().queryAll()
        if(encuestasPendientes.count() > 0){
            for(encuesta in encuestasPendientes){
                val respuestas = EncuestaRespuestas().query { equalTo("idEncuestaBO", encuesta.Id) }
                val manager = ServiceManager()
                manager.enviarEncuesta(encuesta, respuestas, this){
                    EncuestaRespuestas().deleteAll()
                    EncuestaBO().deleteAll()
                }
            }
        }
    }

    fun getCodigoSucursal(){
        val intent = Intent(applicationContext, CaptureActivity::class.java)
        intent.action = "com.google.zxing.client.android.SCAN"
        intent.putExtra("SAVE_HISTORY", false)
        startActivityForResult(intent, 0)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 0) {
            if (resultCode == Activity.RESULT_OK) {
                val contents = data?.getStringExtra("SCAN_RESULT")
                //Log.d(FragmentActivity.TAG, "contents: $contents")
            } else if (resultCode == Activity.RESULT_CANCELED) {
                //Log.d(FragmentActivity.TAG, "RESULT_CANCELED")
            }
        }
    }

    fun getEncuestasGuardadas(){
        val encuestaSelectGuardada = EncuestaSelectModel().queryFirst()
        if(encuestaSelectGuardada != null) {
            this.encuestaSeleccionada =
                EncuestaModel().queryFirst { equalTo("Id", encuestaSelectGuardada!!.idEncuesta) }
        }
        if(this.encuestaSeleccionada?.Name == null) {
            this.encuestasGuardadas = EncuestaModel().queryAll()
            val encuesta = this.encuestasGuardadas.find { it.Default == true }
            this.encuestaSeleccionada = encuesta
            encuestaTitulo.setText(encuesta?.Name)
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
                this.finish()
            }
            R.id.nav_sucursal -> {
                try {
                    SharedData.SharedInstance.realmInstance.beginTransaction()
                    SharedData.SharedInstance.realmInstance.deleteAll()
                    SharedData.SharedInstance.realmInstance.commitTransaction()
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                    this.finish()
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
                this.finish()
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
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
