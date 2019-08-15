package DataManager

import Models.*
import ServiceManager.ServiceManager
import android.content.Context
import com.vicpin.krealmextensions.delete
import com.vicpin.krealmextensions.queryAll
import com.vicpin.krealmextensions.save
import org.jetbrains.anko.doAsync

class DataManager {

    fun login(login:LoginModel, context: Context, callback:(LoginResponseClass) -> Unit){
        val manager = ServiceManager()
        doAsync {
            manager.getEncuestas(login, context){
                val result = it
                if(result.messageType == 1) {
                    guardarLogin(login)
                    guardarEncuestas(result.suerveyList)
                    callback(result)
                }
                callback(result)
            }
        }
    }

    fun guardarLogin(login:LoginModel){
        try{
            login.save()
        }catch(exception:Exception){
            System.out.println(exception.localizedMessage)
        }
    }

    fun guardarEncuestas(encuestas:List<EncuestaModel>){
        for (encuesta in encuestas){
            encuesta.save()
            for (pregunta in encuesta.Questions){
                pregunta.save()
            }
        }
    }

    fun deleteEncuestaPendiente(encuesta:EncuestaBO, callback:(Boolean) -> Unit){
        val encuestaBorrar = encuesta
        EncuestaBO().delete { equalTo("Id", encuesta.Id) }
        EncuestaRespuestas().delete { equalTo("idEncuestaBO", encuesta.Id) }
        val encuestasPendientes = EncuestaBO().queryAll()
        if(encuestasPendientes.contains(encuestaBorrar)){
            this.deleteEncuestaPendiente(encuestaBorrar){
                if(it){
                    callback(true)
                }
            }
        }else{
            callback(true)
        }
    }
}