package com.example.myapplication

import Adapters.EncuestasAdapter
import DataManager.DataManager
import Helpers.TablaListener
import Models.*
import ServiceManager.ServiceManager
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.vicpin.krealmextensions.*
import kotlinx.android.synthetic.main.activity_encuestas.*
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.doAsync

class EncuestasActivity : AppCompatActivity() {

    var encuestasGuardadas = listOf<EncuestaModel>()
    //var encuestasRecyclerView:RecyclerView? = null
    var adaptador:EncuestasAdapter? = null
    var layoutManager:RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_encuestas)

        this.getEncuestasGuardadas()
        this.getEncuestasPendientes()

        encuestasRecyclerView.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        encuestasRecyclerView.layoutManager = layoutManager

        this.adaptador = EncuestasAdapter(this, this.encuestasGuardadas, object:TablaListener{
            override fun opcionMultipleSeleccionada(opcion: String) {

            }

            override fun onClick(vista: View, index: Int) {
                val dato = encuestasGuardadas.get(index)
                val encuestaSeleccionada = EncuestaSelectModel()
                encuestaSeleccionada.id = 1
                encuestaSeleccionada.idEncuesta = dato.Id!!
                doAsync{
                    EncuestaSelectModel().deleteAll()
                    encuestaSeleccionada.save()
                }
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("Encuesta", dato)
                startActivity(intent)
                finish()
            }
        })
        encuestasRecyclerView.adapter = this.adaptador

        /*val linea = DividerItemDecoration(this, 1)
        encuestasRecyclerView.addItemDecoration(linea)*/

        swipeToRefresh.setOnRefreshListener {
            actualizarEncuestas()
        }
    }

    override fun onBackPressed() {
        val intent = Intent(applicationContext, HomeActivity::class.java)
        startActivity(intent)
        this.finish()
    }

    fun actualizarEncuestas(){
        val manager = DataManager()
        var login = LoginModel().queryFirst()
        EncuestaModel().deleteAll()
        manager.login(login!!, applicationContext){
            val result = it
            if(result){
                swipeToRefresh.isRefreshing = false
                getNuevasEncuestas()
            }else{
                System.out.println("Hubo un error")
            }
        }
    }

    fun getEncuestasGuardadas(){
        val encuestas = EncuestaModel().queryAll()
        this.encuestasGuardadas = encuestas
    }

    fun getEncuestasPendientes():List<EncuestaBO> {
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
        return encuestasPendientes
    }

    fun getNuevasEncuestas(){
        val encuestas = EncuestaModel().queryAll()
        this.encuestasGuardadas = encuestas

        this.adaptador = EncuestasAdapter(this, this.encuestasGuardadas, object:TablaListener{
            override fun opcionMultipleSeleccionada(opcion: String) {

            }

            override fun onClick(vista: View, index: Int) {
                val dato = encuestasGuardadas.get(index)
                val intent = Intent(applicationContext, HomeActivity::class.java)
                intent.putExtra("Encuesta", dato)
                startActivity(intent)
                finish()
            }
        })

        encuestasRecyclerView.adapter = this.adaptador
    }
}
