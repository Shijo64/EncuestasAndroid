package Adapters

import Helpers.TablaListener
import android.content.Context
import android.graphics.Typeface
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.opcion_multiple_template.view.*

class OpcionMultipleAdapter(context:Context ,opcionesSeleccionadas:List<String>, opciones: List<String>, var listener:TablaListener) : RecyclerView.Adapter<OpcionMultipleAdapter.ViewHolder>() {
    var items:List<String>? = null
    var opcionesSeleccionadas:List<String>? = null
    var context:Context? = null

    init{
        this.items = opciones
        this.opcionesSeleccionadas = opcionesSeleccionadas
        this.context = context
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OpcionMultipleAdapter.ViewHolder {
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.opcion_multiple_template, parent, false)

        val viewHolder = ViewHolder(this.context!!, this.opcionesSeleccionadas!!, vista, listener)

        return viewHolder
    }

    override fun getItemCount(): Int {
        return this.items!!.count()
    }

    override fun onBindViewHolder(holder: OpcionMultipleAdapter.ViewHolder, position: Int) {
        val item = items?.get(position)
        holder.nombre?.setText(item)
        if(this.opcionesSeleccionadas!!.contains(item)){
            holder.checkBox.isChecked = true
        }
    }

    class ViewHolder(context:Context, opcionesSeleccionadas: List<String>, vista: View, listener:TablaListener):RecyclerView.ViewHolder(vista), View.OnClickListener{

        var vista = vista
        var nombre: TextView? = null
        var listener:TablaListener? = null
        val checkBox = vista.findViewById<CheckBox>(R.id.multipleOpcion)

        init{
            nombre = vista.multipleOpcion
            this.listener = listener
            vista.setOnClickListener(this)
            val lightFont: Typeface = Typeface.createFromAsset(context.assets, "fonts/graphik_light.ttf")
            checkBox.typeface = lightFont
            checkBox.setOnClickListener{
                this.listener?.opcionMultipleSeleccionada((nombre as CheckBox?)!!.text.toString())
                /*if(checkBox.isChecked == true){
                    this.listener?.opcionMultipleSeleccionada((nombre as CheckBox?)!!.text.toString())
                }else{

                }*/
            }
            /*checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
                if(isChecked == true){
                    this.listener?.opcionMultipleSeleccionada((nombre as CheckBox?)!!.text.toString())
                }else{
                    this.listener?.opcionMultipleSeleccionada((nombre as CheckBox?)!!.text.toString())
                }
            }*/
        }

        override fun onClick(v: View?) {
            //this.listener?.onClick(v!!, adapterPosition)
        }
    }
}