package Models

import com.vicpin.krealmextensions.queryAll
import io.realm.RealmList
import io.realm.RealmObject
import java.util.*

open class EncuestaBO:RealmObject() {
    var Id = 0
    var CodigoEncuesta = ""
    var Orden = 0
    var FechaOperacion = Date()
    var EncuestaId = 0
    var nombreEncuesta = ""
    var FechaRegistro = Date()
    var respuestas = RealmList<EncuestaRespuestas>()

    fun idIncrement():Int{
        var encuestas = EncuestaBO().queryAll()
        if(encuestas.count() > 0){
            encuestas = encuestas.sortedWith(compareBy { it.Id })
            val last = encuestas.get(encuestas.count() - 1)
            val id = last.Id
            return id + 1
        }else {
            return 0
        }
    }
}