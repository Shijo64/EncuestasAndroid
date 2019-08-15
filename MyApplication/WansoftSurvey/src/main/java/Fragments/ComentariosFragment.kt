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
import android.widget.MultiAutoCompleteTextView
import com.example.Wansoft.Survey.EncuestaActivity

import com.example.myapplication.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ComentariosFragment : Fragment() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_comentarios, container, false)
        val activity = getActivity() as EncuestaActivity
        val respuesta = arguments!!.getString("respuesta")
        val commentTextView = vista.findViewById<MultiAutoCompleteTextView>(R.id.comentarioTextView)
        val lightFont: Typeface = Typeface.createFromAsset(activity.assets, "fonts/graphik_light.ttf")
        commentTextView.typeface = lightFont

        if(respuesta != ""){
            commentTextView.setText(respuesta)
        }

        activity.guardarComentarios(respuesta)

        commentTextView.addTextChangedListener(object:TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                activity.guardarComentarios(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                System.out.println("")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                System.out.println("")
            }

        })

        return vista
    }


}
