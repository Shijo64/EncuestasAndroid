package com.example.myapplication

import Adapters.ResumenTableAdapter
import Helpers.ResumenTablaListener
import Models.EncuestaBO
import Models.EncuestaModel
import Models.EncuestaRespuestas
import Models.PreguntaModel
import ServiceManager.ServiceManager
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import com.kaopiz.kprogresshud.KProgressHUD
import com.vicpin.krealmextensions.queryAll
import com.vicpin.krealmextensions.save
import com.vicpin.krealmextensions.saveAll
import org.jetbrains.anko.*

class ResumenActivity : AppCompatActivity() {

    var adaptador:ResumenTableAdapter? = null
    var layoutManager:RecyclerView.LayoutManager? = null
    var respuestas:ArrayList<EncuestaRespuestas>? = null
    var preguntas:ArrayList<PreguntaModel>? = null
    var encuesta:EncuestaModel? = null
    var encuestasPendientes:List<EncuestaBO>? = null
    lateinit var progressHud: KProgressHUD

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen)
        this.progressHud = KProgressHUD.create(this)
            .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
            .setLabel("Por favor espera")
            .setDetailsLabel("Enviando encuesta...")
            .setCancellable(true)
            .setAnimationSpeed(2)
            .setDimAmount(0.5f)

        val resumenRecyclerView = findViewById<RecyclerView>(R.id.resumenRecycler)
        resumenRecyclerView.setHasFixedSize(true)
        this.respuestas = intent.getParcelableArrayListExtra<EncuestaRespuestas>("respuestas")
        this.preguntas = intent.getParcelableArrayListExtra<PreguntaModel>("preguntas")
        this.encuesta = intent.getParcelableExtra("encuesta")

        layoutManager = LinearLayoutManager(this)
        resumenRecyclerView.layoutManager = layoutManager
        resumenRecyclerView.isNestedScrollingEnabled = false

        this.adaptador = ResumenTableAdapter(this, this.preguntas!!, this.respuestas!!, object:ResumenTablaListener{})

        resumenRecyclerView.adapter = this.adaptador
        resumenRecyclerView.setHasFixedSize(true)

        /*val linea = DividerItemDecoration(this, 1)
        resumenRecyclerView.addItemDecoration(linea)*/

        val enviarButton = findViewById<Button>(R.id.enviarEncuestaButton)
        enviarButton.setOnClickListener {
            this.progressHud.show()

            var encuestaEnviar = EncuestaBO()
            encuestaEnviar.EncuestaId = this@ResumenActivity.encuesta!!.Id!!
            encuestaEnviar.Id = encuestaEnviar.idIncrement()
            encuestaEnviar.nombreEncuesta = this@ResumenActivity.encuesta!!.Name!!
            encuestaEnviar.CodigoEncuesta = this@ResumenActivity.encuesta!!.Name!!
            encuestaEnviar.Orden = SharedData.SharedInstance.numeroOrden.toInt()
            encuestaEnviar.FechaOrden = SharedData.SharedInstance.fechaOrden

            var respuestasEnviar = mutableListOf<EncuestaRespuestas>()
            for (respuesta in this@ResumenActivity.respuestas!!){
                respuesta.idEncuestaBO = encuestaEnviar.Id
                respuesta.Id = respuesta.idIncrement()
                respuestasEnviar.add(respuesta)
            }
            respuestasEnviar.saveAll()

            encuestaEnviar.save()

            val manager = ServiceManager()
            manager.enviarEncuesta(encuestaEnviar, respuestasEnviar, this){
                var message = it["MessageType"].toString()
                if(message == "1"){
                    this.progressHud.dismiss()
                    val intent = Intent(this, ResultActivity::class.java)
                    startActivity(intent)
                    SharedData.SharedInstance.respuestas = mutableListOf<EncuestaRespuestas>()
                    SharedData.SharedInstance.numeroOrden = ""
                    this.finish()
                }else{
                    this.progressHud.dismiss()
                    alert("Hubo un problema, porfavor intenta de nuevo") {
                        title = "Aviso"
                        positiveButton("Aceptar"){}
                    }.show().apply {
                        getButton(AlertDialog.BUTTON_POSITIVE)?.let { it.setBackgroundColor(Color.WHITE) }
                        getButton(AlertDialog.BUTTON_POSITIVE)?.let { it.setTextColor(Color.parseColor("#ff33b5e5")) }
                    }
                }
            }
        }
    }
}