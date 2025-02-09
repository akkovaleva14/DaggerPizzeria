package com.example.daggerpizzeria.example_13

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.PizzaChef
import com.example.daggerpizzeria.models.impl.SpicyPizzaImpl
import dagger.Module
import dagger.Provides

@Module
class PizzaProvidersModule13 {

    @Provides
    fun provideSpicyPizzaImpl(pizzaChef: PizzaChef): Pizza = SpicyPizzaImpl(pizzaChef)
}