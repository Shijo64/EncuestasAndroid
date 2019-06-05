package com.example.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        /*Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            this.finish()
        }, 4000)*/

        val background = object : Thread() {
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
        background.start()
    }
}
