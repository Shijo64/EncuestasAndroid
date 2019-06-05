package com.example.myapplication

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acerca_de.*

class AcercaDeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de)
        val lightFont: Typeface = Typeface.createFromAsset(assets, "fonts/graphik_light.ttf")
        val regularFont: Typeface = Typeface.createFromAsset(assets, "fonts/graphik_regular.ttf")
        wansoftText.typeface = regularFont
        versionText.typeface = lightFont
    }
}
