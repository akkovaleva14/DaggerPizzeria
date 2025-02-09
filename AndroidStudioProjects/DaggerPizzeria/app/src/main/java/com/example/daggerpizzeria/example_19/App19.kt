package com.example.daggerpizzeria.example_19

import android.app.Application

// 7. Класс приложения
class App19 : Application() {
    lateinit var appComponent: AppComponent
    lateinit var orderComponent: OrderComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
        orderComponent = appComponent.getOrderComponentFactory().create()
    }
}

/*
Создает AppComponent
Получает фабрику OrderComponent
Создает OrderComponent



Workflow внедрения

В App19 создается AppComponent
Из AppComponent получается фабрика OrderComponent
Создается OrderComponent с собственной Scope
PizzaOrderRepository создается один раз в рамках OrderComponent
Внедрение происходит через inject() или получение зависимостей напрямую

🔑 Ключевые преимущества:

Scope: Контроль времени жизни зависимостей
Субкомпоненты: Модульность и переиспользование
Внедрение зависимостей: Декларативное описание графа зависимостей
Синглтоны: Эффективное управление объектами

💡 Особенности реализации

@OrderScope гарантирует, что PizzaOrderRepository создается только один раз
Субкомпонент позволяет изолировать зависимости заказа
Фабрика субкомпонента дает гибкость в создании
 */