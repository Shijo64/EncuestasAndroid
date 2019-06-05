package Models

import android.os.Parcel
import android.os.Parcelable
import io.realm.RealmList
import io.realm.RealmObject
import java.util.*

open class EncuestaModel() :RealmObject(), Parcelable {
    var Id:Int? = 0
    var Name:String? = null
    var CreationDate:Date? = null
    var Status:Int? = 0
    var Default:Boolean? = false
    var Questions = RealmList<PreguntaModel>()

    constructor(parcel: Parcel) : this() {
        Id = parcel.readValue(Int::class.java.classLoader) as? Int
        Name = parcel.readString()
        Status = parcel.readValue(Int::class.java.classLoader) as? Int
        Default = parcel.readValue(Boolean::class.java.classLoader) as? Boolean
        CreationDate = Date(parcel.readLong())
        parcel.readTypedList(Questions, PreguntaModel.CREATOR)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(Id)
        parcel.writeString(Name)
        parcel.writeValue(Status)
        parcel.writeValue(Default)
        parcel.writeLong(CreationDate!!.time)
        parcel.writeTypedList(Questions)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<EncuestaModel> {
        override fun createFromParcel(parcel: Parcel): EncuestaModel {
            return EncuestaModel(parcel)
        }

        override fun newArray(size: Int): Array<EncuestaModel?> {
            return arrayOfNulls(size)
        }
    }
}
