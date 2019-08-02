package Fragments


import android.graphics.Typeface
import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.myapplication.EncuestaActivity

import com.example.myapplication.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class CelularFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_celular, container, false)
        val activity = getActivity() as EncuestaActivity
        val respuesta = arguments!!.getString("respuesta")
        val celularTextView = vista.findViewById<EditText>(R.id.celularText)
        val lightFont: Typeface = Typeface.createFromAsset(activity.assets, "fonts/graphik_light.ttf")
        celularTextView.typeface = lightFont

        if(respuesta != ""){
            celularTextView.setText(respuesta)
        }

        activity.guardarCelular(respuesta)

        celularTextView.addTextChangedListener(object:TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                val valid = isPhoneValid(s.toString())
                if(valid){
                    activity.guardarCelular(s.toString())
                    activity.setError(false)
                }else{
                    celularTextView.error = "Teléfono inválido"
                    activity.setError(true)
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                System.out.println("")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                System.out.println("")
            }

            fun isPhoneValid(phone: String): Boolean {
                return Patterns.PHONE.toRegex().matches(phone)
            }
        })

        return vista
    }


}
