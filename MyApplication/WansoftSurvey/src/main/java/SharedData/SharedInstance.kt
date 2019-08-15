package SharedData

import Models.EncuestaRespuestas
import android.graphics.Typeface
import io.realm.Realm
import java.util.*

object SharedInstance {
    val realmInstance = Realm.getDefaultInstance()
    var respuestas = mutableListOf<EncuestaRespuestas>()
    var numeroOrden = ""
    var fechaOrden = Date()
    var fechaSeleccionada = Date()
    var codigoOpcional = false
}