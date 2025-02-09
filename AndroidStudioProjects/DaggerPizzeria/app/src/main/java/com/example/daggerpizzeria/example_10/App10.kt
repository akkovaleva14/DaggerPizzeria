package com.example.daggerpizzeria.example_10

import android.app.Application
import android.util.Log
import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.PizzaChef
import javax.inject.Inject

class App10 : Application() {

    @Inject
    lateinit var spicyPizza: Pizza

    private lateinit var appComponent: AppComponent10

    override fun onCreate() {
        super.onCreate()

        // Создаем объект повара, который будет передан в модуль
        val pizzaChef = PizzaChef("Джузеппе")

        // Инициализируем граф зависимостей
        appComponent = DaggerAppComponent10
            .builder()
            .pizzaProvidersModule10(PizzaProvidersModule10(pizzaChef))
            .build()

        // Внедряем зависимости
        appComponent.injectIntoApp(this)

        Log.d("Aleks", "App10: pizza ${spicyPizza.javaClass.simpleName}")

        spicyPizza.prepare()
        spicyPizza.serve()
    }
}