package Fragments


import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.Wansoft.Survey.EncuestaActivity

import com.example.myapplication.R

class TextoFragment : Fragment() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista = inflater.inflate(R.layout.fragment_texto, container, false)
        val activity = getActivity() as EncuestaActivity
        val respuesta = arguments!!.getString("respuesta")
        val textField = vista.findViewById<TextView>(R.id.nombreText)
        val lightFont: Typeface = Typeface.createFromAsset(activity.assets, "fonts/graphik_light.ttf")
        textField.typeface = lightFont

        if(respuesta != ""){
            textField.setText(respuesta)
        }

        activity.guardarTexto(respuesta)

        textField.addTextChangedListener(object:TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                activity.guardarTexto(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                System.out.println("Prueba")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                System.out.println("Prueba")
            }

        })

        return vista
    }
}
