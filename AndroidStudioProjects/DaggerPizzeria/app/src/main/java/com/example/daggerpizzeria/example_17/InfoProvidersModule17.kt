package com.example.daggerpizzeria.example_17

import com.example.daggerpizzeria.models.api.Pizza
import dagger.Module
import dagger.Provides

@Module
class InfoProvidersModule17 {
    @Provides
    fun provideInfo(pizza: Pizza, pizzaType: String): Info {
        return Info(
            pizzaStyle = pizza.javaClass.simpleName.removeSuffix("PizzaImpl"),
            pizzaType = pizzaType
        )
    }
}

/*
Создает объект Info с использованием зависимостей Pizza и pizzaType
 */
