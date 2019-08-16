package com.example.Wansoft.Survey

import DataManager.DataManager
import Enums.TipoPregunta
import Fragments.*
import Models.*
import ServiceManager.ServiceManager
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import io.realm.RealmList
import kotlinx.android.synthetic.main.activity_encuesta.*
import android.graphics.Color
import android.graphics.Typeface
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.view.View
import com.example.myapplication.R
import com.kaopiz.kprogresshud.KProgressHUD
import com.vicpin.krealmextensions.*
import org.jetbrains.anko.alert


class EncuestaActivity : AppCompatActivity() {

    var currentIndex = 0
    var encuesta:EncuestaModel? = null
    var pregunta:PreguntaModel? = null
    var preguntas = mutableListOf<PreguntaModel>()
    var encuestaEnviar = DetalleResultadoEncuesta()
    var respuesta:EncuestaRespuestas? = null
    var errorPantalla:Boolean = false
    var fromResumen:Boolean = false
    lateinit var progressHud: KProgressHUD
    //var preguntasSorted:List<PreguntaModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_encuesta)
        val regularFont:Typeface = Typeface.createFromAsset(assets, "fonts/graphik_regular.ttf")
        this.encuesta = intent.getParcelableExtra("Encuesta")

        getPreguntas()
        if(this.preguntas.count() > 0) {
            setPregunta()
        }else{
            siguienteButton.visibility = View.INVISIBLE
            atrasButton.visibility = View.INVISIBLE
            alert("La encuesta no cuenta con preguntas, revisa la configuración en el portal") {
                title = "Aviso"
                positiveButton("Aceptar"){}
            }.show().apply {
                getButton(android.support.v7.app.AlertDialog.BUTTON_POSITIVE)?.let { it.setTextColor(Color.parseColor("#3E4883")) }
            }
        }

        siguienteButton.typeface = regularFont
        siguienteButton.setOnClickListener {
            siguientePregunta()
        }

        atrasButton.typeface = regularFont
        atrasButton.setOnClickListener {
            preguntaAnterior()
        }
    }

    fun getPreguntas(){
        if(this.encuesta!!.Questions.count() > 0) {
            for (pregunta in this.encuesta!!.Questions) {
                if (pregunta.Status == 1) {
                    this.preguntas.add(pregunta)
                }
            }

            var sorted = this.preguntas.sortedWith(compareBy { it.Order })
            this.preguntas = sorted as MutableList<PreguntaModel>
        }
    }

    fun setPregunta(){
        val respuestasGuardadas = SharedData.SharedInstance.respuestas
        this.pregunta = this.preguntas[this.currentIndex]
        val numeroPregunta = this.currentIndex + 1
        val numeroText = ""+ numeroPregunta + " de " + this.preguntas.count()
        val lightFont:Typeface = Typeface.createFromAsset(assets, "fonts/graphik_light.ttf")
        val regularFont:Typeface = Typeface.createFromAsset(assets, "fonts/graphik_regular.ttf")
        numeroPreguntaText.typeface = lightFont
        numeroPreguntaText.setText(numeroText)
        preguntaText.typeface = regularFont
        preguntaText.setText(pregunta!!.Description)
        //val respuesta = EncuestaRespuestas()
        this.respuesta = respuestasGuardadas.find { item -> item.idPregunta == this.pregunta!!.Id }

        if(this.respuesta == null){
            this.respuesta = EncuestaRespuestas()
            this.respuesta!!.numeroPregunta = this.pregunta!!.Order
            this.respuesta!!.idEncuesta = this.pregunta!!.SurveyId
            this.respuesta!!.idPregunta = this.pregunta!!.Id
        }

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()

        val opciones = ArrayList<OpcionesPreguntaModel>(this.pregunta!!.AnswerOptions)
        //val optionalToast = FancyToast.makeText(this,"Es necesario responder la pregunta para poder continuar",FancyToast.LENGTH_LONG,FancyToast.INFO,true);

        when(this.pregunta!!.QuestionType!!.Description){
            TipoPregunta.ESTRELLA.tipo ->
            {
                val bundle = Bundle()
                val fragment = FragmentRating()
                if(this.respuesta!!.respuesta != "") {
                    val rating = this.respuesta!!.respuesta.toFloat()
                    bundle.putFloat("rating", rating)
                }else{
                    bundle.putFloat("rating", 5.0F)
                }

                fragment.arguments = bundle
                transaction.replace(controlLayout.id, fragment)
                transaction.commit()
                /*if(this.pregunta!!.Optional == false){
                    this.siguienteButton.isEnabled = false
                    optionalToast.show()
                }else{
                    this.siguienteButton.isEnabled = true
                }*/
            }
            /*TipoPregunta.COMBO.tipo ->
            {
                if(opciones.count() > 0) {
                    val bundle = Bundle()
                    val fragment = ComboFragment()
                    if (this.respuesta!!.respuesta != "") {
                        val respuestaSeleccionada = this.respuesta!!.respuesta
                        bundle.putString("respuesta", respuestaSeleccionada)
                    } else {
                        var opcionDefault = opciones.find { it.Default == true }
                        if (opcionDefault == null) {
                            opcionDefault = opciones.first()
                        }
                        val respuestaSeleccionada = opcionDefault!!.Id
                        bundle.putInt("respuesta", respuestaSeleccionada)
                    }
                    bundle.putParcelableArrayList("opciones", opciones)
                    fragment.arguments = bundle
                    transaction.replace(controlLayout.id, fragment)
                    transaction.commit()
                }
            }*/
            TipoPregunta.SEGMENTO.tipo ->
            {
                if(opciones.count() > 0) {
                    val bundle = Bundle()
                    val fragment = SegmentoFragment()
                    if (this.respuesta!!.respuesta != "") {
                        val respuestaSeleccionada = this.respuesta!!.respuesta
                        bundle.putString("respuesta", respuestaSeleccionada)
                    } else {
                        var default = opciones.find { it.Default == true }
                        if (default == null) {
                            default = opciones.first()
                        }
                        val respuestaSeleccionada = default!!.Id
                        bundle.putString("respuesta", respuestaSeleccionada.toString())
                    }
                    bundle.putParcelableArrayList("opciones", opciones)
                    fragment.arguments = bundle
                    transaction.replace(controlLayout.id, fragment)
                    transaction.commit()
                }
            }
            TipoPregunta.TEXTO.tipo ->
            {
                val bundle = Bundle()
                val fragment = TextoFragment()
                if(this.respuesta!!.respuesta != ""){
                    val respuestaSeleccionada = this.respuesta!!.respuesta
                    bundle.putString("respuesta", respuestaSeleccionada)
                }else{
                    bundle.putString("respuesta", "")
                }
                fragment.arguments = bundle
                transaction.replace(controlLayout.id, fragment)
                transaction.commit()
            }
            TipoPregunta.FECHA.tipo ->
            {
                val bundle = Bundle()
                val fragment = FechaFragment()
                if(this.respuesta!!.respuesta != ""){
                    val respuestaSeleccionada = this.respuesta!!.respuesta
                    bundle.putString("respuesta", respuestaSeleccionada)
                }else{
                    bundle.putString("respuesta", "")
                }
                fragment.arguments = bundle
                transaction.replace(controlLayout.id, fragment)
                transaction.commit()
            }
            TipoPregunta.OPCIONMULTIPLE.tipo ->
            {
                if(opciones.count() > 0) {
                    val bundle = Bundle()
                    val fragment = OpcionMultipleFragment()
                    if (this.respuesta!!.respuesta != "") {
                        val respuestaSeleccionada = this.respuesta!!.respuesta
                        bundle.putString("respuesta", respuestaSeleccionada)
                    } else {
                        bundle.putString("respuesta", "")
                    }
                    transaction.replace(controlLayout.id, fragment)
                    transaction.commit()
                }
            }
            TipoPregunta.COMENTARIOS.tipo ->
            {
                val bundle = Bundle()
                val fragment = ComentariosFragment()
                if(this.respuesta!!.respuesta != ""){
                    val respuestaSeleccionada = this.respuesta!!.respuesta
                    bundle.putString("respuesta", respuestaSeleccionada)
                }else{
                    bundle.putString("respuesta", "")
                }
                fragment.arguments = bundle
                transaction.replace(controlLayout.id, fragment)
                transaction.commit()
            }
            TipoPregunta.EMAIL.tipo ->
            {
                val bundle = Bundle()
                val fragment = EmailFragment()
                if(this.respuesta!!.respuesta != ""){
                    val respuestaSeleccionada = this.respuesta!!.respuesta
                    bundle.putString("respuesta", respuestaSeleccionada)
                }else{
                    bundle.putString("respuesta", "")
                }
                fragment.arguments = bundle
                transaction.replace(controlLayout.id, fragment)
                transaction.commit()
            }
            TipoPregunta.CELULAR.tipo ->
            {
                val bundle = Bundle()
                val fragment = CelularFragment()
                if(this.respuesta!!.respuesta != ""){
                    val respuestaSeleccionada = this.respuesta!!.respuesta
                    bundle.putString("respuesta", respuestaSeleccionada)
                }else{
                    bundle.putString("respuesta", "")
                }
                fragment.arguments = bundle
                transaction.replace(controlLayout.id, fragment)
                transaction.replace(controlLayout.id, fragment)
                transaction.commit()
            }
        }
    }

    fun siguientePregunta(){
        this.hideKeyboard(this)
        if(this.fromResumen){
            this.progressHud = KProgressHUD.create(this)
                .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
                .setLabel("Por favor espera")
                .setDetailsLabel("Enviando encuesta...")
                .setCancellable(true)
                .setAnimationSpeed(2)
                .setDimAmount(0.5f)

            val connectivityManager = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
            val isConnected = activeNetwork?.isConnected

            var encuestaEnviar = EncuestaBO()
            encuestaEnviar.EncuestaId = this.encuesta!!.Id!!
            encuestaEnviar.Id = encuestaEnviar.idIncrement()
            encuestaEnviar.nombreEncuesta = this.encuesta!!.Name!!
            encuestaEnviar.CodigoEncuesta = this.encuesta!!.Name!!
            encuestaEnviar.Orden = SharedData.SharedInstance.numeroOrden.toInt()
            encuestaEnviar.FechaOrden = SharedData.SharedInstance.fechaOrden

            var respuestasEnviar = mutableListOf<EncuestaRespuestas>()
            val respuestas = SharedData.SharedInstance.respuestas.sortedWith(compareBy { it.numeroPregunta })
            for (respuesta in respuestas){
                respuesta.idEncuestaBO = encuestaEnviar.Id
                respuesta.Id = respuesta.idIncrement()
                respuestasEnviar.add(respuesta)
            }
            respuestasEnviar.saveAll()

            encuestaEnviar.save()

            if(isConnected != null){
                this.progressHud.show()

                val manager = ServiceManager()
                manager.enviarEncuesta(encuestaEnviar, respuestasEnviar, this){
                    var message = ""
                    if(it != null) {
                        message = it?.get("MessageType").toString()
                    }
                    if(message == "1"){

                        val dataManager = DataManager()
                        dataManager.deleteEncuestaPendiente(encuestaEnviar){
                            if(it){
                                this.progressHud.dismiss()
                                val intent = Intent(this, ResultActivity::class.java)
                                startActivity(intent)
                                SharedData.SharedInstance.respuestas = mutableListOf<EncuestaRespuestas>()
                                SharedData.SharedInstance.numeroOrden = ""
                                this.finish()
                            }
                        }
                    }else{
                        this.progressHud.dismiss()
                        alert("Hubo un problema, porfavor intenta de nuevo") {
                            title = "Aviso"
                            positiveButton("Aceptar"){}
                        }.show().apply {
                            getButton(android.support.v7.app.AlertDialog.BUTTON_POSITIVE)?.let { it.setTextColor(Color.parseColor("#3E4883")) }
                        }
                    }
                }
            }else {
                alert("No hay conexión a internet, la encuesta se guardara para ser enviada después.") {
                    title = "Aviso"
                    positiveButton("Aceptar") {
                        this@EncuestaActivity.noConexionEncuestaPendiente()
                    }
                }.show().apply {
                    getButton(android.support.v7.app.AlertDialog.BUTTON_POSITIVE)?.let { it.setTextColor(Color.parseColor("#3E4883")) }
                }
            }
        } else if(this.currentIndex < this.preguntas.count() - 1 && this.errorPantalla == false){
            this.currentIndex = this.currentIndex + 1
            this.pregunta = this.preguntas[this.currentIndex]
            setPregunta()

            if(this.currentIndex == this.preguntas.count() - 1){
                siguienteButton.setText("Resumen")
            }
        }else if(this.errorPantalla == false){
            //MOSTRAR RESUMEN
            this.currentIndex = this.currentIndex + 1
            numeroPreguntaText.setText("")
            preguntaText.setText("Resumen")
            this.siguienteButton.setText("Enviar")
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()
            val fragment = ResumenFragment()
            transaction.replace(controlLayout.id, fragment)
            transaction.commit()
            this.fromResumen = true
            /*val intent = Intent(this, ResumenActivity::class.java)
            val respuestas = SharedData.SharedInstance.respuestas.sortedWith(compareBy { it.numeroPregunta })
            val respuestasArray = ArrayList<EncuestaRespuestas>(respuestas)
            val preguntasArray = ArrayList<PreguntaModel>(this.preguntas)
            intent.putParcelableArrayListExtra("respuestas", respuestasArray)
            intent.putParcelableArrayListExtra("preguntas", preguntasArray)
            intent.putExtra("encuesta", this.encuesta)
            startActivity(intent)*/
        }
    }

    fun noConexionEncuestaPendiente(){
        this.progressHud.dismiss()
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        SharedData.SharedInstance.respuestas = mutableListOf<EncuestaRespuestas>()
        SharedData.SharedInstance.numeroOrden = ""
        this.finish()
    }

    fun preguntaAnterior(){
        this.hideKeyboard(this)
        if(this.currentIndex > 0 && this.currentIndex <= this.preguntas.count() && this.errorPantalla == false){
            if(this.fromResumen){
                siguienteButton.setText("Resumen")
                this.fromResumen = false
            }else {
                siguienteButton.setText("Siguiente")
            }
            this.currentIndex = this.currentIndex - 1
            this.pregunta = this.preguntas[this.currentIndex]
            setPregunta()
        }else if(this.errorPantalla == false){
            SharedData.SharedInstance.respuestas = mutableListOf<EncuestaRespuestas>()
            SharedData.SharedInstance.numeroOrden = ""
            this.finish()
        }
    }

    override fun onBackPressed() {
        //super.onBackPressed()
        this.preguntaAnterior()
    }

    //Metodos para guardar respuestas
    fun hideKeyboard(activity: Activity) {
        val inputManager = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        // check if no view has focus:
        val currentFocusedView = activity.currentFocus
        if (currentFocusedView != null) {
            inputManager.hideSoftInputFromWindow(currentFocusedView.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
        }
    }

    fun setError(error:Boolean){
        this.errorPantalla = error
    }

    fun getOpciones(lista:RealmList<OpcionesPreguntaModel>):ArrayList<OpcionesPreguntaModel>{
        val opciones = arrayListOf<OpcionesPreguntaModel>()
        for (opcion in lista){
            opciones.add(opcion)
        }

        return opciones
    }

    fun guardarRating(rating:Float){
        this.respuesta!!.respuesta = rating.toString()
        guardarRespuesta(this.respuesta!!)
    }

    fun guardarOpcionSeleccionada(opcion:String){
        this.respuesta!!.respuesta = opcion
        guardarRespuesta(this.respuesta!!)
    }

    fun guardarSegmento(respuesta:String){
        this.respuesta!!.respuesta = respuesta
        guardarRespuesta(this.respuesta!!)
    }

    fun guardarTexto(respuesta:String){
        this.respuesta!!.respuesta = respuesta
        guardarRespuesta(this.respuesta!!)
    }

    fun guardarFecha(fecha:String){
        this.respuesta!!.respuesta = fecha
        guardarRespuesta(this.respuesta!!)
    }

    fun guardarOpcionMultiple(opcion:String){
        var lista = mutableListOf<String>()
        lista = this.respuesta!!.respuesta.split(",").toMutableList()
        for(dato in lista){
            if(dato == ""){
                lista.remove(dato)
            }
        }

        if(lista.contains(opcion)){
            lista.remove(opcion)
            this.respuesta!!.respuesta = lista.joinToString(",")
            guardarRespuesta(this.respuesta!!)
        }else{
            lista.add(opcion)
            this.respuesta!!.arrayRespuestas.add(opcion)
            this.respuesta!!.respuesta = lista.joinToString(",")
            guardarRespuesta(this.respuesta!!)
        }

    }

    fun guardarComentarios(comentarios:String){
        this.respuesta!!.respuesta = comentarios
        guardarRespuesta(this.respuesta!!)
    }

    fun guardarEmail(email:String){
        this.respuesta!!.respuesta = email
        guardarRespuesta(this.respuesta!!)
    }

    fun guardarCelular(celular:String){
        this.respuesta!!.respuesta = celular
        guardarRespuesta(this.respuesta!!)
    }

    fun guardarRespuesta(respuesta:EncuestaRespuestas){
        var data = SharedData.SharedInstance.respuestas
        val count = data.count()
        if(count > 0){
            var index = data.indexOf(respuesta)
            if(data.contains(respuesta)){
                SharedData.SharedInstance.respuestas[index] = respuesta
            }else{
                SharedData.SharedInstance.respuestas.add(respuesta)
            }
        }else{
            SharedData.SharedInstance.respuestas.add(respuesta)
        }
    }
}
