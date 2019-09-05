package Fragments


import Adapters.OpcionMultipleAdapter
import Adapters.SegmentoAdapter
import Helpers.TablaListener
import Models.OpcionesPreguntaModel
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.CheckedTextView
import android.widget.ListView
import com.example.Wansoft.Survey.EncuestaActivity

import com.example.myapplication.R


class SegmentoFragment : Fragment() {

    var arrayAdapter:ArrayAdapter<String>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_segmento, container, false)
        val activity = this.activity as EncuestaActivity
        var respuesta = arguments!!.getString("respuesta")
        val opciones = arguments!!.getParcelableArrayList<OpcionesPreguntaModel>("opciones")
        val opcion = opciones.find { it.Default == true }
        val index = opciones.indexOf(opcion)
        var listView = vista.findViewById<ListView>(R.id.segmentoListView)
        listView.choiceMode = ListView.CHOICE_MODE_SINGLE

        activity.guardarSegmento(respuesta)

        var respuestaSeleccionada = opciones.find { it.Id == respuesta.toInt() }
        var indexRespuesta = opciones.indexOf(respuestaSeleccionada)



        var lista = mutableListOf<String>()
        for(opcion in opciones){
            lista.add(opcion.Description)
        }

        arrayAdapter = ArrayAdapter(activity, R.layout.listview_radio_left, lista)
        listView.adapter = arrayAdapter
        listView.setItemChecked(indexRespuesta, true)

        listView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position, id ->
            var posicion = position
            var respuesta = opciones.get(position)
            activity.guardarSegmento(respuesta.Id.toString())
        })

        return vista
    }
}
