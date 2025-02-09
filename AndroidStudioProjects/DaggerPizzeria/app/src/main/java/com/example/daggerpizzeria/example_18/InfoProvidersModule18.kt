package com.example.daggerpizzeria.example_18

import com.example.daggerpizzeria.models.api.Pizza
import dagger.Module
import dagger.Provides

@Module
class InfoProvidersModule18 {
    @Provides
    fun provideInfo(pizza: Pizza, pizzaType: String): Info {
        return Info(
            pizzaStyle = pizza.javaClass.simpleName.removeSuffix("PizzaImpl"),
            pizzaType = pizzaType
        )
    }
}

/*
Создает объект Info
Использует внедренные зависимости: Pizza и pizzaType
 */