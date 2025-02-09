package com.example.daggerpizzeria.example_13


import android.app.Application
import android.util.Log
import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.PizzaChef
import javax.inject.Inject

class App13 : Application() {

    @Inject
    lateinit var pizza: Pizza

    lateinit var appComponent: AppComponent13

    override fun onCreate() {
        super.onCreate()
        //Отдельно создаем объект, который передадим в компонент
        val pizzaChef = PizzaChef("Джузеппе")
        // Инициализируем граф
        appComponent = DaggerAppComponent13
            .builder()
            // Передаем объект компоненту
            .setPizzaChefToComponent(pizzaChef)
            .customBuildAppComp()

        val pizzaManager = appComponent.getPizzaManager()
        pizzaManager.checkChef()

        appComponent.injectIntoApp(this)
        Log.d(
            "Aleks", "App13:\n" +
                    "pizza ${pizza.javaClass.simpleName}"
        )
        pizza.prepare()
    }
}
