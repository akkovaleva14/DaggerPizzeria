package com.example.daggerpizzeria.example_6


import android.app.Application
import android.util.Log
import com.example.daggerpizzeria.Hawaiian
import com.example.daggerpizzeria.Margherita
import com.example.daggerpizzeria.Pepperoni
import com.example.daggerpizzeria.Vegetarian
import com.example.daggerpizzeria.models.api.Pizza
import javax.inject.Inject

class App6: Application() {

    @Pepperoni
    @Inject
    lateinit var pepperoniPizza: Pizza

    @Margherita
    @Inject
    lateinit var margheritaPizza: Pizza

    @Vegetarian
    @Inject
    lateinit var vegetarianPizza: Pizza

    @Hawaiian
    @Inject
    lateinit var hawaiianPizza: Pizza

    lateinit var appComponent: AppComponent6

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent6.create()
        appComponent.injectIntoApp(this)
        Log.d("Aleks", "App6. Pizzeria Menu:\n" +
                "Pepperoni Pizza: ${pepperoniPizza.javaClass.simpleName}\n" +
                "Margherita Pizza: ${margheritaPizza.javaClass.simpleName}\n" +
                "Vegetarian Pizza: ${vegetarianPizza.javaClass.simpleName}\n" +
                "Hawaiian Pizza: ${hawaiianPizza.javaClass.simpleName}"
        )
    }
}
