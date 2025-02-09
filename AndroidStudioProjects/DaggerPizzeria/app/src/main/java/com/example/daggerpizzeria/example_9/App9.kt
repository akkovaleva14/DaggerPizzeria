package com.example.daggerpizzeria.example_9

import android.app.Application
import android.util.Log
import com.example.daggerpizzeria.models.impl.HawaiianPizzaImpl
import javax.inject.Inject

class App9 : Application() {

    lateinit var appComponent: AppComponent9

    @Inject
    lateinit var hawaiianPizza: HawaiianPizzaImpl

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent9.create()
        appComponent.injectIntoApp(this)

        Log.d(
            "Aleks", "App9. Pizzeria:\n" +
                    "Pizza: ${hawaiianPizza.javaClass.simpleName}"
        )
    }
}

