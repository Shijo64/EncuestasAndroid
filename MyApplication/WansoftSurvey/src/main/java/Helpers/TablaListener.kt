package Helpers

import android.view.View

interface TablaListener {
    fun onClick(vista: View, index:Int)
    fun opcionMultipleSeleccionada(opcion:String)
}