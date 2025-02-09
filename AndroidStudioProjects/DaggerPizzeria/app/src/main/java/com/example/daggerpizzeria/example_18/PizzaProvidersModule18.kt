package com.example.daggerpizzeria.example_18

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.MargheritaPizzaImpl
import dagger.Module
import dagger.Provides

@Module
class PizzaProvidersModule18 {
    @Provides
    fun provideMargheritaPizzaImpl(): Pizza = MargheritaPizzaImpl()
}

/*
Предоставляет базовую реализацию пиццы
Создает и возвращает экземпляр MargheritaPizzaImpl
 */