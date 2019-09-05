package com.example.Wansoft.Survey

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import gr.net.maroulis.library.EasySplashScreen

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_splash)

        val view = EasySplashScreen(this)
            .withFullScreen()
            .withBackgroundResource(R.color.colorPrimary)
            .withLogo(R.drawable.logo)
            .withTargetActivity(LoginActivity::class.java)
            .withSplashTimeOut(4000)
            .create()
        setContentView(view)
            //.withBackgroundResource(R.id.)
        /*Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            this.finish()
        }, 4000)*/

        /*val background = object : Thread() {
            override fun run(){
                try{
                    Thread.sleep(4000)
                    val intent = Intent(baseContext, LoginActivity::class.java)
                    startActivity(intent)
                    this@SplashActivity.finish()
                }catch(e:Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()*/
    }
}
