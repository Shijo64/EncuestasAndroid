package Fragments


import android.app.DatePickerDialog
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.EncuestaActivity

import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_fecha.*
import java.text.SimpleDateFormat
import java.util.*

class FechaFragment : Fragment() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_fecha, container, false)
        val activity = this.activity as EncuestaActivity
        val fechaButton = vista.findViewById<Button>(R.id.fechaButton)
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val respuesta = arguments!!.getString("respuesta")

        val currentDate = Date()
        val format = SimpleDateFormat("dd-MMM-yyyy")
        val fechaText = vista.findViewById<EditText>(R.id.fechaText)
        val lightFont: Typeface = Typeface.createFromAsset(activity.assets, "fonts/graphik_light.ttf")
        fechaText.typeface = lightFont

        if(respuesta != ""){
            fechaText.setText(respuesta)
        }else {
            val fecha = format.format(currentDate)
            fechaText.setText(fecha)
            activity.guardarFecha(fecha)
        }

        fechaButton.setOnClickListener {

            val datePicker = DatePickerDialog(this.activity,R.style.DatePicker, DatePickerDialog.OnDateSetListener(){
                    view, year, monthOfYear, dayOfMonth ->
                val calendar = Calendar.getInstance()
                calendar.set(year, monthOfYear, dayOfMonth)
                val fecha = calendar.time
                val fechaTexto = format.format(fecha)
                fechaText.setText(fechaTexto)
                activity.guardarFecha(fechaTexto)
            }, year, month, day).show()
        }
        return vista
    }


}
