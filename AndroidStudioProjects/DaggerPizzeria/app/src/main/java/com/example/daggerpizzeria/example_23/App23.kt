package com.example.daggerpizzeria.example_23

import android.app.Application
import android.util.Log

class App23 : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .build()
        val componentHashCode = appComponent.hashCode()
        Log.d("Aleks/App", "🚀 AppComponent created and initialized. Instance ID: $componentHashCode")
    }
}
