package Adapters

import Helpers.TablaListener
import Models.EncuestaBO
import Models.EncuestaModel
import android.content.Context
import android.graphics.Typeface
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.myapplication.R
import com.vicpin.krealmextensions.query
import com.vicpin.krealmextensions.queryAll
import kotlinx.android.synthetic.main.template_encuesta.view.*

class EncuestasAdapter(context:Context, encuestas:List<EncuestaModel>, var listener:TablaListener): RecyclerView.Adapter<EncuestasAdapter.ViewHolder>() {

    var items:List<EncuestaModel>? = null
    var context:Context? = null

    init{
        this.items = encuestas
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EncuestasAdapter.ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.template_encuesta, parent, false)
        val viewHolder = ViewHolder(this.context!!, vista, listener)

        return viewHolder
    }

    override fun getItemCount(): Int {
        return items?.count()!!
    }

    override fun onBindViewHolder(holder: EncuestasAdapter.ViewHolder, position: Int) {
        val item = items?.get(position)
        val prueba = EncuestaBO().queryAll()
        val pendientes = EncuestaBO().query {equalTo("EncuestaId", item!!.Id)}
        val texto = item?.Name + "    Pendientes: ("+pendientes.count()+")"
        holder.nombre?.setText(texto)
    }

    class ViewHolder(context:Context, vista: View, listener:TablaListener):RecyclerView.ViewHolder(vista), View.OnClickListener{

        var vista = vista
        var nombre: TextView? = null
        var listener:TablaListener? = null

        init{
            val lightFont: Typeface = Typeface.createFromAsset(context.assets, "fonts/graphik_light.ttf")
            vista.nombreEncuesta.typeface = lightFont
            this.nombre = vista.nombreEncuesta
            this.listener = listener
            vista.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            this.listener?.onClick(v!!, adapterPosition)
        }
    }
}