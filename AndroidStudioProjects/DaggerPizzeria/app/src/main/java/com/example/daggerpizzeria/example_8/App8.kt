package com.example.daggerpizzeria.example_8

import android.app.Application
import android.util.Log
import com.example.daggerpizzeria.models.api.Pizza
import javax.inject.Inject

class App8 : Application() {

    @Inject
    lateinit var mapOfPizzas: MutableMap<String, Pizza>

    lateinit var appComponent: AppComponent8

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent8.create()
        appComponent.injectIntoApp(this)
        //        val mapOfPizzas = appComponent.getMapOfPizzas()
        Log.d(
            "Aleks", "App8. Pizzeria Menu:\n" +
                    "Pizzas count: ${mapOfPizzas.size}\n" +
                    "Pizzas: ${mapOfPizzas.entries.joinToString { "key = ${it.key}, value = ${it.value.javaClass.simpleName}" }}"
        )
    }
}
