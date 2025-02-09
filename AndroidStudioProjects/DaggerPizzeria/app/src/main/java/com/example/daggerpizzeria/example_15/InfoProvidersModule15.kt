package com.example.daggerpizzeria.example_15

import com.example.daggerpizzeria.models.api.Pizza
import dagger.Module
import dagger.Provides

@Module
class InfoProvidersModule15 {
    @Provides
    fun provideInfo(pizza: Pizza): Info {
        return Info(pizzaType = pizza.javaClass.simpleName.removeSuffix("PizzaImpl"))
    }
}
