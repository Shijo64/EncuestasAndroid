package Fragments

import Adapters.ResumenTableAdapter
import Helpers.ResumenTablaListener
import Models.EncuestaModel
import Models.EncuestaRespuestas
import Models.PreguntaModel
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.Wansoft.Survey.EncuestaActivity
import com.example.myapplication.R

class ResumenFragment: Fragment() {
    var adaptador:ResumenTableAdapter? = null
    var layoutManager:RecyclerView.LayoutManager? = null
    var respuestas:ArrayList<EncuestaRespuestas>? = null
    var preguntas:ArrayList<PreguntaModel>? = null
    var encuesta: EncuestaModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val vista = inflater.inflate(R.layout.fragment_resumen, container, false)
        val activity = getActivity() as EncuestaActivity
        val recyclerViewResumen = vista.findViewById<RecyclerView>(R.id.resumenRecyclerView)
        val respuestas = SharedData.SharedInstance.respuestas.sortedWith(compareBy { it.numeroPregunta })
        this.respuestas = ArrayList<EncuestaRespuestas>(respuestas)
        this.preguntas = ArrayList<PreguntaModel>(activity.preguntas)
        this.encuesta = activity.encuesta

        layoutManager = LinearLayoutManager(this.activity)
        recyclerViewResumen.layoutManager = layoutManager
        recyclerViewResumen.isNestedScrollingEnabled = true

        this.adaptador = ResumenTableAdapter(activity, this.preguntas!!, this.respuestas!!, object: ResumenTablaListener {})

        recyclerViewResumen.adapter = this.adaptador
        recyclerViewResumen.setHasFixedSize(true)

        return vista
    }
}