package com.example.daggerpizzeria.example_20

import dagger.Subcomponent

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
Субкомпонент наследует зависимости от родительского компонента
Фабрика позволяет создавать экземпляры OrderComponent
Метод inject() для ручного внедрения зависимостей
 */