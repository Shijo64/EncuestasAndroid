package com.example.Wansoft.Survey

import Fragments.ConfiguracionFragment
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.R

class ConfiguracionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)
        supportFragmentManager.beginTransaction()
            .replace(R.id.configuracionView, ConfiguracionFragment())
            .commit()
    }

    override fun onBackPressed() {
        val intent = Intent(applicationContext, HomeActivity::class.java)
        startActivity(intent)
        this.finish()
    }
}
