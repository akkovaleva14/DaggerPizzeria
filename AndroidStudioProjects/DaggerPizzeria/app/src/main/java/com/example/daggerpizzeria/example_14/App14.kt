package com.example.daggerpizzeria.example_14

import android.app.Application
import android.util.Log
import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.PizzaChef
import javax.inject.Inject

class App14 : Application() {

    @Inject
    lateinit var pizza: Pizza

    lateinit var appComponent: AppComponent14

    override fun onCreate() {
        super.onCreate()
        //Отдельно создаем объект, который передадим в компонент
        val pizzaChef = PizzaChef("Джузеппе")
        // Инициализируем граф
        appComponent = DaggerAppComponent14
            .factory()
            // Передаем объект компоненту
            .create(pizzaChef)

        val pizzaManager = appComponent.getPizzaManager()
        pizzaManager.checkChef()

        appComponent.injectIntoApp(this)
        Log.d(
            "Aleks", "App14:\n" +
                    "pizza ${pizza.javaClass.simpleName}"
        )
        pizza.prepare()
    }
}
