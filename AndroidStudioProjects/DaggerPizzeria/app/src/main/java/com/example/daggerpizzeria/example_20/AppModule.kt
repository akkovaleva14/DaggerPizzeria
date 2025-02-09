package com.example.daggerpizzeria.example_20

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @AppScope
    @Provides
    fun providePizzaOrderRepository(): PizzaOrderRepository {
        return PizzaOrderRepository()
    }
}

/*
@AppScope гарантирует создание одного экземпляра репозитория
providePizzaOrderRepository() создает и кэширует репозиторий
Метод getPizzaOrderRepository() возвращает закэшированный экземпляр
 */