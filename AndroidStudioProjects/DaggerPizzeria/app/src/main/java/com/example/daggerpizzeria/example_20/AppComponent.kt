package com.example.daggerpizzeria.example_20

import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getPizzaOrderRepository(): PizzaOrderRepository
    fun getOrderComponentFactory(): OrderComponent.Factory
}

/*
@AppScope гарантирует создание одного экземпляра репозитория
providePizzaOrderRepository() создает и кэширует репозиторий
Метод getPizzaOrderRepository() возвращает закэшированный экземпляр
 */