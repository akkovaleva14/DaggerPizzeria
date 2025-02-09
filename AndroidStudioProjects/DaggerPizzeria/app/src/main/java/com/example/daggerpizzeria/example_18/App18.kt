package com.example.daggerpizzeria.example_18

import android.app.Application
import android.util.Log

class App18 : Application() {
    lateinit var appComponent: AppComponent18
    lateinit var infoSubcomponent: InfoSubcomponent18

    fun isInfoSubcomponentInitialized() = ::infoSubcomponent.isInitialized

    override fun onCreate() {
        super.onCreate()
        // Инициализируем граф
        appComponent = DaggerAppComponent18.create()
        Log.d("Aleks", "App18:")
    }
}

/*
🌐 Поток внедрения зависимостей

Шаг 1: Инициализация в App18
override fun onCreate() {
    super.onCreate()
    appComponent = DaggerAppComponent18.create()
}
Создание графа зависимостей при старте приложения

Шаг 2: Создание субкомпонента в MainActivity18
app.infoSubcomponent = app.appComponent
    .getInfoSubcomponentFactory()
    .create(data)
Динамическое создание субкомпонента
Передача pizzaType через @BindsInstance

Шаг 3: Получение зависимостей в SecondFragment18
val info = (requireContext().applicationContext as App18)
    .infoSubcomponent
    .getInfo()
Получение объекта Info через субкомпонент

🔗 Цепочка внедрения

PizzaProvidersModule18 создает Pizza
InfoProvidersModule18 получает Pizza и pizzaType
Создается объект Info

 */