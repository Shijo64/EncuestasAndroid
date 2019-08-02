package DataManager

import Models.EncuestaModel
import Models.LoginModel
import Models.LoginResponseClass
import ServiceManager.ServiceManager
import android.content.Context
import android.widget.Toast
import com.example.myapplication.LoginActivity
import com.vicpin.krealmextensions.save
import io.realm.Realm
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

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
}