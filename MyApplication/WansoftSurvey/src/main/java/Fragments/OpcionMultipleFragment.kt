package Fragments


import Adapters.OpcionMultipleAdapter
import Helpers.TablaListener
import Models.OpcionesPreguntaModel
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.Wansoft.Survey.EncuestaActivity

import com.example.myapplication.R


class OpcionMultipleFragment : Fragment() {

    var adaptador:OpcionMultipleAdapter? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var listaOpciones = mutableListOf<OpcionesPreguntaModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_opcion_multiple, container, false)
        val activity = getActivity() as EncuestaActivity
        val opciones = activity.pregunta!!.AnswerOptions

        var respuestasSeleccionadas = mutableListOf<String>()
        respuestasSeleccionadas = activity.respuesta!!.respuesta.split(",").toMutableList()
        /*if(respuestasSeleccionadas.first() == "") {

            activity.guardarOpcionMultiple("")
        }*/

        for (opcion in opciones){
            listaOpciones.add(opcion)
            if(opcion.Default == true && respuestasSeleccionadas.first() == ""){
                activity.guardarOpcionMultiple(opcion.Id.toString())
            }
        }

        val recyclerView = vista.findViewById<RecyclerView>(R.id.opcionMultipleRecyclerView)

        recyclerView.setHasFixedSize(true)

        respuestasSeleccionadas = activity.respuesta!!.respuesta.split(",").toMutableList()

        layoutManager = LinearLayoutManager(this.activity)
        recyclerView.layoutManager = layoutManager

        this.adaptador = OpcionMultipleAdapter(activity, respuestasSeleccionadas, this.listaOpciones, object: TablaListener{
            override fun onClick(vista: View, index: Int) {
            }

            override fun opcionMultipleSeleccionada(opcion: String) {
                for(seleccion in listaOpciones){
                    if(seleccion.Description == opcion){
                        activity.guardarOpcionMultiple(seleccion.Id.toString())
                    }
                }
            }

        })
        recyclerView.adapter = this.adaptador

        /*val linea = DividerItemDecoration(this.activity, 1)
        recyclerView.addItemDecoration(linea)*/
        // Inflate the layout for this fragment
        return vista
    }


}
