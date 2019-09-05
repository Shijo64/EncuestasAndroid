package Adapters

import Helpers.TablaListener
import Models.OpcionesPreguntaModel
import android.content.Context
import android.graphics.Typeface
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.segmento_template.view.*

class SegmentoAdapter(context: Context, opcionSeleccionada:String, opciones: List<OpcionesPreguntaModel>, var listener: TablaListener) : RecyclerView.Adapter<SegmentoAdapter.ViewHolder>() {
    var items:List<OpcionesPreguntaModel>? = null
    var opcionSeleccionada:String? = null
    var context: Context? = null
    var mPosition = -1

    init{
        this.items = opciones
        this.opcionSeleccionada = opcionSeleccionada
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SegmentoAdapter.ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.segmento_template, parent, false)

        val viewHolder = ViewHolder(this.context!!, this.opcionSeleccionada!!, vista, listener, mPosition)

        return viewHolder
    }

    override fun getItemCount(): Int {
        return this.items!!.count()
    }

    override fun onBindViewHolder(holder: SegmentoAdapter.ViewHolder, position: Int) {
        val item = items?.get(position)
        holder.nombre?.setText(item?.Description)
        if(this.opcionSeleccionada!! == item?.Id.toString()){
            holder.checkbox.isChecked = true
        }else{
            holder.checkbox.isChecked = false
        }
    }

    class ViewHolder(context: Context, opcionSeleccionada:String, vista: View, listener: TablaListener, mPosition:Int):
        RecyclerView.ViewHolder(vista), View.OnClickListener{

        var vista = vista
        var nombre: TextView? = null
        var listener: TablaListener? = null
        val checkbox = vista.findViewById<CheckBox>(R.id.segmentoOpcion)

        init{
            nombre = vista.segmentoOpcion
            this.listener = listener
            vista.setOnClickListener(this)
            val lightFont: Typeface = Typeface.createFromAsset(context.assets, "fonts/graphik_light.ttf")
            val regularFont: Typeface = Typeface.createFromAsset(context.assets, "fonts/graphik_regular.ttf")
            checkbox.typeface = regularFont
            checkbox.setOnClickListener{
                this.listener?.opcionMultipleSeleccionada((nombre as CheckBox?)!!.text.toString())
            }
            /*checkbox.setOnCheckedChangeListener { buttonView, isChecked ->
                if(isChecked == true){
                    this.listener?.opcionMultipleSeleccionada((nombre as CheckBox?)!!.text.toString())
                }else{
                    this.listener?.opcionMultipleSeleccionada((nombre as CheckBox?)!!.text.toString())
                }
            }*/
        }

        override fun onClick(v: View?) {
            //this.listener?.onClick(v!!, adapterPosition)
            print("Prueba")
        }
    }
}