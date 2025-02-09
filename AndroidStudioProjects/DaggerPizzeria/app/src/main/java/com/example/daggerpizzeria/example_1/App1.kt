package com.example.daggerpizzeria.example_1

import android.app.Application
import android.util.Log

class App1 : Application() {
    private lateinit var appComponent: AppComponent1
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent1.create()
        val pizza = appComponent.getMargherita()
        Log.d("Aleks", "App1:\n" +
                "pizza ${pizza.javaClass.simpleName}")
        pizza.prepare()
    }
}

/* Применение в Application (App1)
DaggerAppComponent1.create() создает компонент
getMargherita() получает экземпляр Pizza
 */