package com.example.myapplication

import Enums.TipoPregunta
import Fragments.*
import Models.*
import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.RatingBar
import com.vicpin.krealmextensions.createOrUpdate
import com.vicpin.krealmextensions.query
import com.vicpin.krealmextensions.queryAll
import io.realm.RealmList
import kotlinx.android.synthetic.main.activity_encuesta.*
import kotlinx.android.synthetic.main.fragment_rating.*
import android.content.Context.INPUT_METHOD_SERVICE
import android.graphics.Typeface
import android.view.View


class EncuestaActivity : AppCompatActivity() {

    var currentIndex = 0
    var encuesta:EncuestaModel? = null
    var pregunta:PreguntaModel? = null
    var preguntas = mutableListOf<PreguntaModel>()
    var encuestaEnviar = DetalleResultadoEncuesta()
    var respuesta:EncuestaRespuestas? = null
    var errorPantalla:Boolean = false
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
            val alert = AlertDialog.Builder(this)
            alert.setTitle("Aviso")
            alert.setMessage("La encuesta no cuenta con preguntas, revisa la configuración en el portal")
            alert.setPositiveButton("Aceptar", null)
            val dialog:AlertDialog = alert.create()
            dialog.show()
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

        when(pregunta!!.QuestionType!!.Description){
            TipoPregunta.ESTRELLA.tipo ->
            {
                val bundle = Bundle()
                val fragment = FragmentRating()
                if(this.respuesta!!.respuesta != "") {
                    val rating = this.respuesta!!.respuesta.toFloat()
                    bundle.putFloat("rating", rating)
                }else{
                    bundle.putFloat("rating", 0.0F)
                }

                fragment.arguments = bundle
                transaction.replace(controlLayout.id, fragment)
                transaction.commit()
            }
            TipoPregunta.COMBO.tipo ->
            {
                val bundle = Bundle()
                val fragment = ComboFragment()
                if(this.respuesta!!.respuesta != ""){
                    val respuestaSeleccionada = this.respuesta!!.respuesta
                    bundle.putString("respuesta", respuestaSeleccionada)
                }else{
                    val opcionDefault = opciones.find { it.Default == true }
                    val respuestaSeleccionada = opcionDefault!!.Description
                    bundle.putString("respuesta", respuestaSeleccionada)
                }
                bundle.putParcelableArrayList("opciones", opciones)
                fragment.arguments = bundle
                transaction.replace(controlLayout.id, fragment)
                transaction.commit()
            }
            TipoPregunta.SEGMENTO.tipo ->
            {
                val bundle = Bundle()
                val fragment = SegmentoFragment()
                if(this.respuesta!!.respuesta != ""){
                    val respuestaSeleccionada = this.respuesta!!.respuesta
                    bundle.putString("respuesta", respuestaSeleccionada)
                }else{
                    val default = opciones.find { it.Default == true }
                    val respuestaSeleccionada = default!!.Description
                    bundle.putString("respuesta", respuestaSeleccionada)
                }
                bundle.putParcelableArrayList("opciones", opciones)
                fragment.arguments = bundle
                transaction.replace(controlLayout.id, fragment)
                transaction.commit()
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
                val bundle = Bundle()
                val fragment = OpcionMultipleFragment()
                if(this.respuesta!!.respuesta != ""){
                    val respuestaSeleccionada = this.respuesta!!.respuesta
                    bundle.putString("respuesta", respuestaSeleccionada)
                }else{
                    bundle.putString("respuesta", "")
                }
                transaction.replace(controlLayout.id, fragment)
                transaction.commit()
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
                transaction.commit()
            }
        }
    }

    fun siguientePregunta(){
        this.hideKeyboard(this)
        if(this.currentIndex < this.preguntas.count() - 1 && this.errorPantalla == false){
            this.currentIndex = this.currentIndex + 1
            this.pregunta = this.preguntas[this.currentIndex]
            setPregunta()

            if(this.currentIndex == this.preguntas.count() - 1){
                siguienteButton.setText("Resumen")
            }
        }else if(this.errorPantalla == false){
            //MOSTRAR RESUMEN
            val intent = Intent(this, ResumenActivity::class.java)
            val respuestas = SharedData.SharedInstance.respuestas.sortedWith(compareBy { it.numeroPregunta })
            val respuestasArray = ArrayList<EncuestaRespuestas>(respuestas)
            val preguntasArray = ArrayList<PreguntaModel>(this.preguntas)
            intent.putParcelableArrayListExtra("respuestas", respuestasArray)
            intent.putParcelableArrayListExtra("preguntas", preguntasArray)
            intent.putExtra("encuesta", this.encuesta)
            startActivity(intent)
        }
    }

    fun preguntaAnterior(){
        this.hideKeyboard(this)
        if(this.currentIndex > 0 && this.currentIndex <= this.preguntas.count() && this.errorPantalla == false){
            siguienteButton.setText("Siguiente")
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
