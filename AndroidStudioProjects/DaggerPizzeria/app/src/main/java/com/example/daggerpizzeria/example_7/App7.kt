package com.example.daggerpizzeria.example_7

import android.app.Application
import android.util.Log
import com.example.daggerpizzeria.models.api.Pizza
import javax.inject.Inject

class App7 : Application() {

    @Inject
    lateinit var setOfPizzas: MutableSet<Pizza>

    private lateinit var appComponent: AppComponent7

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent7.create()
        appComponent.injectIntoApp(this)
        //        val setOfPizzas = appComponent.getSetOfPizzas()
        Log.d(
            "Aleks", "App7. Pizzeria Menu:\n" +
                    "Pizzas count: ${setOfPizzas.size}\n" +
                    "Pizzas: ${setOfPizzas.joinToString { it.javaClass.simpleName }}"
        )
    }
}