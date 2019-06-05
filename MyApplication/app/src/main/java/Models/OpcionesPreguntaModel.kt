package Models

import android.os.Parcel
import android.os.Parcelable
import io.realm.RealmObject

open class OpcionesPreguntaModel() :RealmObject(), Parcelable {
    var Id = 0
    var QuestionId = 0
    var Description = ""
    var Order = 0
    var Status = 0
    var Default = false
    var Value = 0

    constructor(parcel: Parcel) : this() {
        Id = parcel.readInt()
        QuestionId = parcel.readInt()
        Description = parcel.readString()
        Order = parcel.readInt()
        Status = parcel.readInt()
        Default = parcel.readByte() != 0.toByte()
        Value = parcel.readInt()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(Id)
        parcel.writeInt(QuestionId)
        parcel.writeString(Description)
        parcel.writeInt(Order)
        parcel.writeInt(Status)
        parcel.writeByte(if (Default) 1 else 0)
        parcel.writeInt(Value)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<OpcionesPreguntaModel> {
        override fun createFromParcel(parcel: Parcel): OpcionesPreguntaModel {
            return OpcionesPreguntaModel(parcel)
        }

        override fun newArray(size: Int): Array<OpcionesPreguntaModel?> {
            return arrayOfNulls(size)
        }
    }
}