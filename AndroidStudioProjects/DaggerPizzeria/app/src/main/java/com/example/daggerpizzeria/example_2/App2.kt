package com.example.daggerpizzeria.example_2

import android.app.Application
import android.util.Log
import com.example.daggerpizzeria.models.api.Pizza
import javax.inject.Inject

class App2 : Application() {
    @Inject
    lateinit var pizza: Pizza

    lateinit var appComponent: AppComponent2

    override fun onCreate() {
        super.onCreate()
        // Создаем компонент
        appComponent = DaggerAppComponent2.create()

        // Проверяем состояние до инъекции
        Log.d("Aleks", "App2: before Injection pizza.isInitialized = ${::pizza.isInitialized}")

        // Внедряем зависимости в Application
        appComponent.injectIntoApp(this)

        // Проверяем состояние после инъекции
        Log.d("Aleks", "App2: after Injection pizza.isInitialized = ${::pizza.isInitialized}")

        // Логируем и используем пиццу
        Log.d("Aleks", "App2:\n" +
                "pizza ${pizza.javaClass.simpleName}")
        pizza.prepare()
        pizza.serve()
    }
}

/*
Аннотация @Inject:
@Inject lateinit var pizza: Pizza говорит Dagger, что нужно внедрить зависимость типа Pizza
lateinit позволяет отложить инициализацию
 */