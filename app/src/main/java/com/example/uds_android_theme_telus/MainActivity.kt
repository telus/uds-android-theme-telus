package com.example.uds_android_theme_telus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(Sydney.suburbs)
        val assetManager = assets
        assetManager.open("telusTheme.json")
    }
}