package com.example.daggerpizzeria.example_17

import android.app.Application
import android.util.Log

class App17 : Application() {
    lateinit var appComponent: AppComponent17
    lateinit var infoSubcomponent: InfoSubcomponent17

    fun isInfoSubcomponentInitialized() = ::infoSubcomponent.isInitialized

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent17.create()
        Log.d("Aleks", "App17 initialized")
    }
}

/*
Хранит ссылки на корневой компонент (AppComponent17) и субкомпонент (InfoSubcomponent17)
DaggerAppComponent17.create() - автоматически сгенерированный Dagger метод создания компонента


Workflow внедрения зависимостей

В App17 создается корневой компонент AppComponent17
В MainActivity17 создается субкомпонент InfoSubcomponent17

app.infoSubcomponent = app.appComponent
    .getInfoSubcomponentBuilder()
    .setPizzaType(data)
    .build()
В SecondFragment17 получаем Info через субкомпонент

val info = (requireContext().applicationContext as App17)
    .infoSubcomponent
    .getInfo()


    Ключевые особенности архитектуры

Модульность: Каждый модуль отвечает за создание конкретных зависимостей
Иерархичность: Корневой компонент + субкомпонент
Динамическое внедрение: @BindsInstance позволяет динамически передавать параметры
Отложенная инициализация: Субкомпонент создается только при необходимости
 */