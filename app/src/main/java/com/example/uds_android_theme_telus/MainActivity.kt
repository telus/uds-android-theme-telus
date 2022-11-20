package com.example.uds_android_theme_telus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.nio.file.AccessMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(Sydney.suburbs)
        object {}.javaClass.getResourceAsStream("/raw/telus_theme.json")?.use { it.reader(Charsets.UTF_8).readText() }

    }
}