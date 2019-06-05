package Models

import android.os.Parcel
import android.os.Parcelable
import io.realm.RealmObject

open class TipoPreguntaModel() :RealmObject(), Parcelable {
    var Id = 0
    var Description = ""

    constructor(parcel: Parcel) : this() {
        Id = parcel.readInt()
        Description = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(Id)
        parcel.writeString(Description)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TipoPreguntaModel> {
        override fun createFromParcel(parcel: Parcel): TipoPreguntaModel {
            return TipoPreguntaModel(parcel)
        }

        override fun newArray(size: Int): Array<TipoPreguntaModel?> {
            return arrayOfNulls(size)
        }
    }
}