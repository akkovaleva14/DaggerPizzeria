package com.example.daggerpizzeria.example_15

import android.app.Application
import android.util.Log
class App15 : Application() {

    lateinit var appComponent: AppComponent15

    override fun onCreate() {
        super.onCreate()
        // Инициализируем граф
        appComponent = DaggerAppComponent15.create()
        val infoSubcomponent = appComponent.getInfoSubcomponent()
        val info = infoSubcomponent.getInfo()
        Log.d(
            "Aleks", "App15:\n" +
                    "info $info")
    }
}
