package com.example.daggerpizzeria.example_20

import android.app.Application

class App20 : Application() {
    lateinit var appComponent: AppComponent
    lateinit var orderComponent: OrderComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
        orderComponent = appComponent.getOrderComponentFactory().create()
    }
}

/*
Dagger генерирует класс DaggerAppComponent
Вызывается метод create() для создания компонента
AppComponent создается с модулем AppModule


🔍 Ключевые Моменты

Один экземпляр репозитория

Создается один раз в AppModule
Живет все время работы приложения
Общий для всех компонентов

Субкомпонент как расширение

OrderComponent наследует зависимости от AppComponent
Фабрика позволяет гибко создавать компоненты

Scope и Жизненный Цикл

@AppScope гарантирует синглтон
Репозиторий не пересоздается при навигации
 */
