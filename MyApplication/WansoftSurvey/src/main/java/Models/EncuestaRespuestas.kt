package Models

import android.os.Parcel
import android.os.Parcelable
import com.vicpin.krealmextensions.queryAll
import io.realm.RealmObject

open class EncuestaRespuestas() : RealmObject(), Parcelable {
    var Id = 0
    var idEncuestaBO = 0
    var idEncuesta = 0
    var idPregunta = 0
    var numeroPregunta = 0
    var respuesta = ""

    constructor(parcel: Parcel) : this() {
        Id = parcel.readInt()
        idEncuestaBO = parcel.readInt()
        idEncuesta = parcel.readInt()
        idPregunta = parcel.readInt()
        numeroPregunta = parcel.readInt()
        respuesta = parcel.readString()
    }

    fun idIncrement():Int{
        var encuestas = EncuestaRespuestas().queryAll()
        if(encuestas.count() > 0){
            encuestas = encuestas.sortedWith(compareBy { it.Id })
            val last = encuestas.get(encuestas.count() - 1)
            val value = last.Id
            return value + 1
        }else{
            return 0
        }
    }

    //var arrayRespuestas = mutableListOf<String>()
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(Id)
        parcel.writeInt(idEncuestaBO)
        parcel.writeInt(idEncuesta)
        parcel.writeInt(idPregunta)
        parcel.writeInt(numeroPregunta)
        parcel.writeString(respuesta)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<EncuestaRespuestas> {
        override fun createFromParcel(parcel: Parcel): EncuestaRespuestas {
            return EncuestaRespuestas(parcel)
        }

        override fun newArray(size: Int): Array<EncuestaRespuestas?> {
            return arrayOfNulls(size)
        }
    }

}