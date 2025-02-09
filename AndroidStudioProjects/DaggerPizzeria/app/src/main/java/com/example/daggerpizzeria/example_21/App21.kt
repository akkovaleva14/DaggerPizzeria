package com.example.daggerpizzeria.example_21

import android.app.Application

class App21 : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this)
    }
}