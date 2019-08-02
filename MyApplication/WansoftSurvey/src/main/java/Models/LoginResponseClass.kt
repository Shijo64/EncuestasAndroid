package Models

import com.google.gson.annotations.SerializedName

class LoginResponseClass {
    @SerializedName("surveyList")
    var suerveyList = mutableListOf<EncuestaModel>()
    @SerializedName("MessageType")
    var messageType = 0
    @SerializedName("Message")
    var message = ""
}