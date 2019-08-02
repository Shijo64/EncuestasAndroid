package com.example.myapplication

import Fragments.ConfiguracionFragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ConfiguracionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)
        supportFragmentManager.beginTransaction()
            .replace(R.id.configuracionView, ConfiguracionFragment())
            .commit()
    }
}
