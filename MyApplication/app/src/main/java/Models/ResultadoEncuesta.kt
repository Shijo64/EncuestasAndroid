package Models

import com.google.gson.annotations.SerializedName
import java.util.*

class ResultadoEncuesta {
    @SerializedName("Id")
    var Id = 0
    @SerializedName("Order")
    var Orden = 0
    @SerializedName("SurveyCode")
    var CodigoEncuesta = ""
    @SerializedName("OperationDate")
    var FechaOperacion = Date()
    @SerializedName("SurveyId")
    var EncuestaId = 0
    @SerializedName("RegistrationDate")
    var FechaRegistro = Date()
    @SerializedName("OrderDate")
    var FechaOrden = Date()
    @SerializedName("SurveyDetailResultList")
    var respuestas = mutableListOf<DetalleResultadoEncuesta>()

    @Transient
    var nombreEncuesta = ""
}