package com.ajithvgiri.authenticator

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class MainApplication : Application(){

    lateinit var preferences: SharedPreferences
    override fun onCreate() {
        super.onCreate()

        preferences = getSharedPreferences("authenticator", Context.MODE_PRIVATE)
    }
}