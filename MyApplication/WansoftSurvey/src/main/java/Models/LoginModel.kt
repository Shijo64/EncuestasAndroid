package Models

import android.os.Build
import android.os.Parcel
import android.os.Parcelable
import com.google.gson.Gson
import io.realm.RealmObject

open class LoginModel() :RealmObject(), Parcelable {
    var idSucursal = ""
    var password = ""


    constructor(parcel: Parcel) : this() {
        idSucursal = parcel.readString()
        password = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(idSucursal)
        parcel.writeString(password)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<LoginModel> {
        override fun createFromParcel(parcel: Parcel): LoginModel {
            return LoginModel(parcel)
        }

        override fun newArray(size: Int): Array<LoginModel?> {
            return arrayOfNulls(size)
        }
    }
}