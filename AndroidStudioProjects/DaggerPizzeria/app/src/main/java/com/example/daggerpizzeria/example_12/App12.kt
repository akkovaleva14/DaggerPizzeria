package com.example.daggerpizzeria.example_12

import android.app.Application
import android.util.Log
import com.example.daggerpizzeria.example_12.di.*
import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.PizzaChef
import javax.inject.Inject

class App12 : Application() {

    @Inject
    lateinit var pizza: Pizza

    lateinit var appComponent: AppComponent12

    override fun onCreate() {
        super.onCreate()
        // Отдельно создаем объект, который передадим в модуль
        val pizzaChef = PizzaChef("Джузеппе")
        // Отдельно создаем модуль, который получает компонент
        val pizzaProvidersModule = PizzaProvidersModule12(pizzaChef)
        // Инициализируем граф
        appComponent = DaggerAppComponent12
            .builder()
            // Передаем нами созданный модуль pizzaProvidersModule с объектом pizzaChef
            .customSetPizzaProvidersModule(pizzaProvidersModule)
            .customBuildAppComp()

        val pizzaManager = appComponent.getPizzaManager()
        pizzaManager.checkChef()

        appComponent.injectIntoApp(this)
        Log.d(
            "Aleks", "App12:\n" +
                    "pizza ${pizza.javaClass.simpleName}"
        )
        pizza.prepare()
    }
}
