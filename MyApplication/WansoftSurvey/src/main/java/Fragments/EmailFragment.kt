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
import com.example.Wansoft.Survey.EncuestaActivity

import com.example.myapplication.R


class EmailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_email, container, false)
        val activity = getActivity() as EncuestaActivity
        val respuesta = arguments!!.getString("respuesta")
        val emailTextView = vista.findViewById<EditText>(R.id.emailText)
        val lightFont: Typeface = Typeface.createFromAsset(activity.assets, "fonts/graphik_light.ttf")
        val regularFont:Typeface = Typeface.createFromAsset(activity.assets, "fonts/graphik_regular.ttf")
        emailTextView.typeface = regularFont

        if(respuesta != ""){
            emailTextView.setText(respuesta)
        }

        activity.guardarEmail(respuesta)

        emailTextView.addTextChangedListener(object:TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                val isValid = this.isEmailValid(s.toString())
                if(isValid) {
                    activity.guardarEmail(s.toString())
                    activity.setError(false)
                }else{
                    emailTextView.error = "Email inválido"
                    activity.setError(true)
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                System.out.println("")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                System.out.println("")
            }

            fun isEmailValid(email: String): Boolean {
                return Patterns.EMAIL_ADDRESS.toRegex().matches(email)
            }
        })

        return vista
    }
}
