package com.example.myapplication

import DataManager.DataManager
import Helpers.JsonDateDeserializer
import Models.EncuestaModel
import Models.LoginModel
import ServiceManager.ServiceManager
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Typeface
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley
import com.google.gson.GsonBuilder
import com.vicpin.krealmextensions.queryFirst
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.AnkoAsyncContext
import org.jetbrains.anko.custom.async
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.doAsyncResult
import org.jetbrains.anko.uiThread
import java.util.*

/**
 * A login screen that offers login via email/password.
 */

/*
 let url = "https://demo7042471.mockable.io/getEncuestas"
        let urlProduccion = "https://www.wansoft.net/wansoft.web/app/GetSurveyList?subsidiaryId=\(login.idSucursal)&subsidiaryPassword=\(login.password)"
 */
class LoginActivity : AppCompatActivity() {
    /**
     * Keep track of the login task to ensure we can cancel it if requested.
     */
    lateinit var context:Context
    lateinit var dialog:AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Realm.init(this)
        context = this
        val lightFont: Typeface = Typeface.createFromAsset(assets, "fonts/graphik_light.ttf")
        val regularFont: Typeface = Typeface.createFromAsset(assets, "fonts/graphik_regular.ttf")
        sucursalTextfield.typeface = lightFont
        passwordTextfield.typeface = lightFont
        loginButton.typeface = regularFont

        loginButton.setOnClickListener{
            val alert = AlertDialog.Builder(context)
            alert.setMessage("Iniciando Sesión")
            this.dialog = alert.show()
            this.login()
        }

        val loginGuardado = LoginModel().queryFirst()
        if(loginGuardado != null){
            sucursalTextfield.setText(loginGuardado!!.idSucursal)
            passwordTextfield.setText(loginGuardado!!.password)
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }

    fun login(){
        //AsyncLogin().execute()
        val manager = DataManager()
        var login = LoginModel()
        login.idSucursal = sucursalTextfield.text.toString()
        login.password = passwordTextfield.text.toString()
        val loginContext = this
        manager.login(login, this){
            val result = it
            if(result){
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                this.dialog.dismiss()
                this.finish()

                System.out.println("Se Guardo el login")
            }else{
                this.dialog.dismiss()
                val builder = AlertDialog.Builder(context)
                builder.setMessage("Hubo un problema al iniciar sesión, porfavor revisa tu conexión")
                builder.setPositiveButton("Aceptar", null)
                this.dialog = builder.show()
            }
        }
    }

    inner class AsyncLogin: AsyncTask<Void, Void, Boolean>() {
        var callback:Boolean? = null

        override fun onPreExecute() {
            super.onPreExecute()
            val alert = AlertDialog.Builder(context)
            alert.setMessage("Iniciando Sesión")
            alert.show()
        }

        override fun doInBackground(vararg params: Void?): Boolean? {
            var result = false
            val manager = DataManager()
            var login = LoginModel()
            login.idSucursal = sucursalTextfield.text.toString()
            login.password = passwordTextfield.text.toString()
            manager.login(login, context){
                this.callback = result
                //return true
            }
            //val response = manager.loginNuevo(login, context)
            return true
        }

        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)
            if(this.callback == true){
                val intent = Intent(context, HomeActivity::class.java)
                startActivity(intent)
                this@LoginActivity.finish()
            }
        }
    }
}
