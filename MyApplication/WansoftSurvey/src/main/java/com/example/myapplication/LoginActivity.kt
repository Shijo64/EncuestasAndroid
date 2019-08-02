package com.example.myapplication

import DataManager.DataManager
import Helpers.JsonDateDeserializer
import Models.EncuestaModel
import Models.LoginModel
import ServiceManager.ServiceManager
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
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
import com.kaopiz.kprogresshud.KProgressHUD
import com.vicpin.krealmextensions.queryFirst
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.async
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
    lateinit var progressHud:KProgressHUD

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Realm.init(this)
        this.context = this
        this.progressHud = KProgressHUD.create(this)
            .setStyle(KProgressHUD.Style.SPIN_INDETERMINATE)
            .setLabel("Por favor espera")
            .setDetailsLabel("Iniciando Sesión...")
            .setCancellable(true)
            .setAnimationSpeed(2)
            .setDimAmount(0.5f)

        val prefs = context.getSharedPreferences("Preferencias", Context.MODE_PRIVATE)
        val ordenManual = prefs.getBoolean("ordenConfig", false)
        SharedData.SharedInstance.codigoOpcional = ordenManual


        val lightFont: Typeface = Typeface.createFromAsset(assets, "fonts/graphik_light.ttf")
        val regularFont: Typeface = Typeface.createFromAsset(assets, "fonts/graphik_regular.ttf")
        sucursalTextfield.typeface = lightFont
        passwordTextfield.typeface = lightFont
        loginButton.typeface = regularFont

        loginButton.setOnClickListener{
            progressHud.show()
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
            if(result.messageType == 1){
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                this.progressHud.dismiss()
                this.finish()

                System.out.println("Se Guardo el login")
            }else{
                //Mostrar alerta
                alert(result.message) {
                    title = "Aviso"
                    positiveButton("Aceptar"){}
                }.show().apply {
                    getButton(AlertDialog.BUTTON_POSITIVE)?.let { it.setBackgroundColor(Color.WHITE) }
                    getButton(AlertDialog.BUTTON_POSITIVE)?.let { it.setTextColor(Color.parseColor("#ff33b5e5")) }
                }
                this.progressHud.dismiss()
            }
        }
    }
}
