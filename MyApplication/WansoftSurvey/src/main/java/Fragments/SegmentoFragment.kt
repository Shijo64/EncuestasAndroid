package Fragments


import Models.OpcionesPreguntaModel
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.myapplication.EncuestaActivity

import com.example.myapplication.R


class SegmentoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_segmento, container, false)
        val activity = this.activity as EncuestaActivity
        val respuesta = arguments!!.getString("respuesta")
        val opciones = arguments!!.getParcelableArrayList<OpcionesPreguntaModel>("opciones")
        val opcion = opciones.find { it.Default == true }
        val index = opciones.indexOf(opcion)

        val radio1 = vista.findViewById<RadioButton>(R.id.segment1)
        radio1.setText(opciones[0].Description)
        val radio2 = vista.findViewById<RadioButton>(R.id.segment2)
        radio2.setText(opciones[1].Description)

        var group = vista.findViewById<RadioGroup>(R.id.segmentRadioGroup)

        if(opciones[0].Description == respuesta){
            group.check(radio1.id)
        }else{
            group.check(radio2.id)
        }

        activity.guardarSegmento(respuesta)

        group.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
            val id = group.checkedRadioButtonId
            val radio = vista.findViewById<RadioButton>(checkedId)
            val texto = radio.text.toString()
            activity.guardarSegmento(texto)
        })

        return vista
    }
}
