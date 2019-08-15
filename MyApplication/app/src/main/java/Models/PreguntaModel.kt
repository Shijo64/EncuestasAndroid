package Models

import android.os.Build
import android.os.Parcel
import android.os.Parcelable
import android.support.annotation.RequiresApi
import com.google.gson.Gson
import io.realm.RealmList
import io.realm.RealmObject

open class PreguntaModel() :RealmObject(), Parcelable {
    var Id = 0
    var SurveyId = 0
    var Description = ""
    var Order = 0
    var Status = 0
    var QuestionType:TipoPreguntaModel? = null
    var AnswerOptions = RealmList<OpcionesPreguntaModel>()

    @RequiresApi(Build.VERSION_CODES.M)
    constructor(parcel: Parcel) : this() {
        Id = parcel.readInt()
        SurveyId = parcel.readInt()
        Description = parcel.readString()
        Order = parcel.readInt()
        Status = parcel.readInt()
        QuestionType = Gson().fromJson(parcel.readString(), TipoPreguntaModel::class.java)
        parcel.readTypedList(AnswerOptions, OpcionesPreguntaModel.CREATOR)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(Id)
        parcel.writeInt(SurveyId)
        parcel.writeString(Description)
        parcel.writeInt(Order)
        parcel.writeInt(Status)
        parcel.writeString(Gson().toJson(QuestionType))
        parcel.writeTypedList(AnswerOptions)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PreguntaModel> {
        @RequiresApi(Build.VERSION_CODES.M)
        override fun createFromParcel(parcel: Parcel): PreguntaModel {
            return PreguntaModel(parcel)
        }

        override fun newArray(size: Int): Array<PreguntaModel?> {
            return arrayOfNulls(size)
        }
    }
}