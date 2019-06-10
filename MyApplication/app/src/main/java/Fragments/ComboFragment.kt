package Fragments


import Models.OpcionesPreguntaModel
import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.example.myapplication.EncuestaActivity

import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_combo.*


class ComboFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val activity = getActivity() as  EncuestaActivity
        val opciones = arguments!!.getParcelableArrayList<OpcionesPreguntaModel>("opciones")
        val respuestaSeleccionada = arguments!!.getString("respuesta")
        var opcionesArray = arrayListOf<String>()
        for (pregunta in opciones) {
            opcionesArray.add(pregunta.Description)
        }

        val vista = inflater.inflate(R.layout.fragment_combo, container, false)
        val spinner = vista.findViewById<Spinner>(R.id.comboSpinner)
        val adapter = ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, opcionesArray)
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spinner.adapter = adapter
        val index = opcionesArray.indexOf(respuestaSeleccionada)
        spinner.setSelection(index)
        activity.guardarOpcionSeleccionada(respuestaSeleccionada)

        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent:AdapterView<*>, view: View, position: Int, id: Long){
                // Display the selected item text on text view
                val respuestaSeleccionada = parent.getItemAtPosition(position).toString()
                activity.guardarOpcionSeleccionada(respuestaSeleccionada)
            }
        }

        return vista
    }
}


