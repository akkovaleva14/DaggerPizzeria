package com.example.daggerpizzeria.example_16

import android.app.Application
import android.util.Log

class App16 : Application() {

    lateinit var appComponent: AppComponent16
    lateinit var infoSubcomponent: InfoSubcomponent16
    fun isInfoSubcomponentInitialized() = ::infoSubcomponent.isInitialized

    override fun onCreate() {
        super.onCreate()
        // Инициализируем граф
        appComponent = DaggerAppComponent16.create()
        Log.d("Aleks", "App16:")
    }
}

/*
Хранит глобальные зависимости для всего приложения
Создает основной компонент Dagger (AppComponent16)
Предоставляет возможность проверить инициализацию субкомпонента


Основные концепции:

Динамическое создание субкомпонента
Передача параметров в субкомпонент во время выполнения
Использование Dagger для внедрения зависимостей
Разделение ответственности между компонентами
Поток работы:

Пользователь вводит тип пиццы в первом фрагменте
При клике создается субкомпонент с введенными данными
Во втором фрагменте отображается введенный тип пиццы
 */