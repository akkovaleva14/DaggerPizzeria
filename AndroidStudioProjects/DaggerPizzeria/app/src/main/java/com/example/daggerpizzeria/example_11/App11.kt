package com.example.daggerpizzeria.example_11

import android.app.Application
import android.util.Log
import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.PizzaChef
import javax.inject.Inject

class App11 : Application() {

    @Inject
    lateinit var pizza: Pizza

    lateinit var appComponent: AppComponent11

    override fun onCreate() {
        super.onCreate()
        // Создаем объект, который передадим в модуль
        val pizzaChef = PizzaChef("Джузеппе")
        // Создаем модуль, который получает компонент
        val pizzaProvidersModule = PizzaProvidersModule11(pizzaChef)
        // Инициализируем граф
        appComponent = DaggerAppComponent11
            .builder()
            // Передаем созданный модуль с объектом pizzaChef
            .pizzaProvidersModule11(pizzaProvidersModule)
            .build()

        val pizzaManager = appComponent.getPizzaManager()
        pizzaManager.checkChef()

        appComponent.injectIntoApp(this)
        Log.d(
            "Aleks", "App11:\n" +
                    "pizza ${pizza.javaClass.simpleName}"
        )
        pizza.prepare()
        pizza.serve()
    }
}
