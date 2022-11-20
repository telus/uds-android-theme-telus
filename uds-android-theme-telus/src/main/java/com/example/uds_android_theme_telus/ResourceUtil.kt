package com.example.uds_android_theme_telus

import androidx.appcompat.app.AppCompatActivity

class ResourceUtil: AppCompatActivity() {
    fun get() {
        return resources.openRawResource(com.telus.uds_android_theme_telus.R.raw.telus_theme).use { it.reader(Charsets.UTF_8).readText() }
    }
}
