package Fragments


import Adapters.OpcionMultipleAdapter
import Helpers.TablaListener
import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.EncuestaActivity

import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_opcion_multiple.*


class OpcionMultipleFragment : Fragment() {

    var adaptador:OpcionMultipleAdapter? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var listaOpciones = mutableListOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_opcion_multiple, container, false)
        val activity = getActivity() as  EncuestaActivity
        val opciones = activity.pregunta!!.AnswerOptions
        activity.guardarOpcionMultiple("")

        for (opcion in opciones){
            listaOpciones.add(opcion.Description)
            if(opcion.Default == true){
                activity.guardarOpcionMultiple(opcion.Description)
            }
        }
        var respuestasSeleccionadas = mutableListOf<String>()
        respuestasSeleccionadas = activity.respuesta!!.respuesta.split(",").toMutableList()

        val recyclerView = vista.findViewById<RecyclerView>(R.id.opcionMultipleRecyclerView)

        recyclerView.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this.activity)
        recyclerView.layoutManager = layoutManager

        this.adaptador = OpcionMultipleAdapter(activity, respuestasSeleccionadas, this.listaOpciones, object: TablaListener{
            override fun onClick(vista: View, index: Int) {

            }

            override fun opcionMultipleSeleccionada(opcion: String) {
                activity.guardarOpcionMultiple(opcion)
            }

        })
        recyclerView.adapter = this.adaptador

        /*val linea = DividerItemDecoration(this.activity, 1)
        recyclerView.addItemDecoration(linea)*/
        // Inflate the layout for this fragment
        return vista
    }


}
