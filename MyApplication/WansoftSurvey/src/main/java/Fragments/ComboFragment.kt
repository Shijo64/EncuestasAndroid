package Fragments


import Models.OpcionesPreguntaModel
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.example.Wansoft.Survey.EncuestaActivity

import com.example.myapplication.R


class ComboFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val activity = getActivity() as EncuestaActivity
        val opciones = arguments!!.getParcelableArrayList<OpcionesPreguntaModel>("opciones")
        val respuestaSeleccionada = arguments!!.getInt("respuesta")
        var opcionesArray = arrayListOf<String>()
        var opcionesRespuestas = arrayListOf<Int>()
        for (pregunta in opciones) {
            opcionesArray.add(pregunta.Description)
            opcionesRespuestas.add(pregunta.Id)
        }


        val vista = inflater.inflate(R.layout.fragment_combo, container, false)
        val spinner = vista.findViewById<Spinner>(R.id.comboSpinner)
        val adapter = ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, opcionesArray)
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        val index = opcionesRespuestas.indexOf(respuestaSeleccionada)
        spinner.setSelection(index)
        activity.guardarOpcionSeleccionada(respuestaSeleccionada.toString())

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent:AdapterView<*>, view: View, position: Int, id: Long){
                // Display the selected item text on text view
                val textView = parent.getChildAt(0) as TextView
                textView.setTextColor(Color.WHITE)
                val respuestaSeleccionada = opcionesRespuestas[position]
                activity.guardarOpcionSeleccionada(respuestaSeleccionada.toString())
            }
        }

        spinner.adapter = adapter

        return vista
    }
}


