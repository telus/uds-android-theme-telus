package com.example.uds_android_theme_telus

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import com.telus.uds_android_theme_telus.R

     fun Resources.get(): String {
        return openRawResource(R.raw.telus_theme).use { it.reader(Charsets.UTF_8).readText() }
    }

