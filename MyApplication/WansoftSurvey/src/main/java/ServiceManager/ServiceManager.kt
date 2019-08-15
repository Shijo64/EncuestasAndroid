package ServiceManager

import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import Helpers.JsonDateDeserializer
import Models.*
import android.content.Context
import com.google.gson.*
import com.vicpin.krealmextensions.queryAll
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.*


class ServiceManager {
    fun getEncuestas(login: LoginModel, context: Context, callback:(LoginResponseClass) -> Unit){
        val queue = Volley.newRequestQueue(context)
        var url = "https://www.wansoft.net/wansoft.web/app/GetSurveyList?subsidiaryId="+login.idSucursal+"&subsidiaryPassword="+login.password

        val request = JsonObjectRequest(Request.Method.GET, url, null, Response.Listener {
            response ->
            val gson = GsonBuilder().registerTypeAdapter(Date::class.java, JsonDateDeserializer()).create()

            val result = gson.fromJson(response.toString(), LoginResponseClass::class.java)
            callback(result)
        },
            Response.ErrorListener {
                System.out.println("Error")
                val result = LoginResponseClass()
                result.message = "Hubo un error, revisa tu conexión por favor"
                result.messageType = 3
                callback(result)
            }
        )
        queue.add(request)
    }

    fun loginNuevo(login: LoginModel, context: Context):Boolean{

        return true
    }

    fun enviarEncuesta(encuesta:EncuestaBO, respuestas: List<EncuestaRespuestas>, context:Context, callback:(JSONObject) -> Unit){
        val queue = Volley.newRequestQueue(context)
        var url = "https://www.wansoft.net/wansoft.web/app/SaveSurveyResponses"
        //val gson = GsonBuilder().registerTypeAdapter(Date::class.java, DateSerializer()).create()
        val builder = GsonBuilder()
        val gson = builder.create()


        val encuestaEnviar = ResultadoEncuesta()
        encuestaEnviar.Id = encuesta.Id
        encuestaEnviar.CodigoEncuesta = encuesta.CodigoEncuesta
        encuestaEnviar.EncuestaId = encuesta.EncuestaId
        val timeZone = TimeZone.getTimeZone("UTC")
        val df = SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'")
        df.timeZone = timeZone
        val operationDateString = df.format(encuesta.FechaOperacion)
        encuestaEnviar.FechaOperacion = df.parse(operationDateString)//encuesta.FechaOperacion
        encuestaEnviar.FechaRegistro = encuesta.FechaRegistro
        encuestaEnviar.FechaOrden = encuesta.FechaOrden
        encuestaEnviar.nombreEncuesta = encuesta.nombreEncuesta
        encuestaEnviar.Orden = encuesta.Orden
        var respuestasEnviar = mutableListOf<DetalleResultadoEncuesta>()
        for (respuesta in respuestas){
            val respuestaEnviar = DetalleResultadoEncuesta()
            respuestaEnviar.Id = respuesta.Id
            respuestaEnviar.idEncuesta = respuesta.idEncuesta
            respuestaEnviar.idEncuestaBO = respuesta.idEncuestaBO
            respuestaEnviar.idPregunta = respuesta.idPregunta
            respuestaEnviar.numeroPregunta = respuesta.numeroPregunta
            respuestaEnviar.respuesta = respuesta.respuesta
            respuestasEnviar.add(respuestaEnviar)
        }
        encuestaEnviar.respuestas = respuestasEnviar
        val jsonServicio = gson.toJson(encuestaEnviar)
        val login = LoginModel().queryAll().get(0)
        val parameters = mapOf("subsidiaryId" to login.idSucursal, "subsidiaryPassword" to login.password, "result" to jsonServicio)
        val jsonToSend = JSONObject(parameters)

        val request = JsonObjectRequest(Request.Method.POST, url, jsonToSend, Response.Listener {
            response ->
            callback(response)
            //System.out.println(response)
        }, Response.ErrorListener {
            error ->
            error.printStackTrace()
        })

        queue.add(request)
    }
}