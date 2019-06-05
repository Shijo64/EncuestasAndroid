package SharedData

import Models.EncuestaRespuestas
import android.graphics.Typeface
import io.realm.Realm

object SharedInstance {
    val realmInstance = Realm.getDefaultInstance()
    var respuestas = mutableListOf<EncuestaRespuestas>()
    var numeroOrden = ""
    var codigoOpcional = true
}