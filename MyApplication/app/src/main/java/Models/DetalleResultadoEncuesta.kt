package Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject

open class DetalleResultadoEncuesta {


    @SerializedName("Id")
    var Id = 0

    @SerializedName("SurveyResultId")
    var idEncuestaBO = 0

    @SerializedName("QuestionId")
    var idPregunta = 0

    @SerializedName("Answer")
    var respuesta = ""

    @Transient
    var numeroPregunta = 0
    @Transient
    var idEncuesta = 0
    @Transient
    var arrayRespuestas = mutableListOf<String>()
}