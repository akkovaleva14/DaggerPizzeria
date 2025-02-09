package com.example.daggerpizzeria.example_19

import dagger.Module
import dagger.Provides

// 3. Модуль для предоставления зависимостей заказа
@Module
class OrderModule {
    @Provides
    @OrderScope
    fun providePizzaOrderRepository(): PizzaOrderRepository {
        return PizzaOrderRepository()
    }
}

/*
Создает и предоставляет PizzaOrderRepository
Аннотация @OrderScope гарантирует синглтон в рамках OrderComponent
 */