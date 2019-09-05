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
import android.widget.EditText
import com.example.Wansoft.Survey.EncuestaActivity

import com.example.myapplication.R
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
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val respuesta = arguments!!.getString("respuesta")

        val currentDate = Date()
        val formatoVista = SimpleDateFormat("dd-MMM-yyyy")
        val fechaText = vista.findViewById<EditText>(R.id.fechaText)
        val lightFont: Typeface = Typeface.createFromAsset(activity.assets, "fonts/graphik_light.ttf")
        val regularFont:Typeface = Typeface.createFromAsset(activity.assets, "fonts/graphik_regular.ttf")
        fechaText.typeface = regularFont

        if(respuesta != ""){
            fechaText.setText(respuesta)
        }else {
            val formatoGuardar = SimpleDateFormat("yyyy-MM-dd")
            val fecha = formatoGuardar.format(currentDate)
            fechaText.setText(fecha)
            activity.guardarFecha(fecha)
        }

        fechaText.setOnClickListener {
            val datePicker = DatePickerDialog(this.activity,R.style.DatePicker, DatePickerDialog.OnDateSetListener(){
                    view, year, monthOfYear, dayOfMonth ->
                val calendar = Calendar.getInstance()
                calendar.set(year, monthOfYear, dayOfMonth)
                val fecha = calendar.time
                val format = SimpleDateFormat("yyyy-MM-dd")
                val fechaTexto = format.format(fecha)
                fechaText.setText(fechaTexto)
                activity.guardarFecha(fechaTexto)
            }, year, month, day).show()
        }
        return vista
    }
}
