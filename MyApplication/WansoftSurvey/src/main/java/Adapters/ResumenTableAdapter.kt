package Adapters

import Helpers.ResumenTablaListener
import Models.DetalleResultadoEncuesta
import Models.EncuestaModel
import Models.EncuestaRespuestas
import Models.PreguntaModel
import android.content.Context
import android.graphics.Typeface
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.resumen_template.view.*

class ResumenTableAdapter(context:Context, preguntas:List<PreguntaModel>, respuestas:List<EncuestaRespuestas>, var listener:ResumenTablaListener):RecyclerView.Adapter<ResumenTableAdapter.ViewHolder>() {

    var respuestas:List<EncuestaRespuestas>? = null
    var preguntas:List<PreguntaModel>? = null
    var context:Context? = null

    init{
        this.respuestas = respuestas
        this.preguntas = preguntas
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.resumen_template, parent, false)
        val viewHolder = ViewHolder(this.context!!, vista, listener)

        return viewHolder
    }

    override fun getItemCount(): Int {
        return this.respuestas!!.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = this.respuestas?.get(position)
        val question = this.preguntas?.get(position)
        holder.pregunta!!.setText(question!!.Description)
        if(item!!.arrayRespuestas!!.count() > 0){
            var respuestasSeleccionadas = mutableListOf<String>()
            for(opcion in item.arrayRespuestas){
                val respuestaOpcion = question.AnswerOptions.first { it.Id == opcion?.toInt() }
                respuestasSeleccionadas.add(respuestaOpcion.Description)
            }
            val respuestasString = respuestasSeleccionadas.joinToString()
            holder.respuesta!!.setText(respuestasString)
        }else{
            holder.respuesta!!.setText(item?.respuesta)
        }
    }

    class ViewHolder(context: Context, vista: View, listener:ResumenTablaListener):RecyclerView.ViewHolder(vista), View.OnClickListener{

        var vista = vista
        var pregunta: TextView? = null
        var respuesta: TextView? = null

        init{
            val lightFont: Typeface = Typeface.createFromAsset(context.assets, "fonts/graphik_light.ttf")
            vista.preguntaText.typeface = lightFont
            vista.respuestaText.typeface = lightFont
            pregunta = vista.preguntaText
            respuesta = vista.respuestaText
        }

        override fun onClick(v: View?) {
            System.out.println("")
        }
    }
}