package com.example.daggerpizzeria.example_19

import dagger.Subcomponent

// 4. Субкомпонент для работы с заказами
@OrderScope
@Subcomponent(modules = [OrderModule::class])
interface OrderComponent {
    fun getPizzaOrderRepository(): PizzaOrderRepository
    fun inject(fragment: OrderFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(): OrderComponent
    }
}

/*
Субкомпонент с собственной Scope
Содержит модуль OrderModule
Предоставляет методы для получения зависимостей
Имеет фабрику для создания (суб?)компонента
 */