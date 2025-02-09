package com.example.daggerpizzeria.example_14

import com.example.daggerpizzeria.models.impl.SpicyPizzaImpl
import com.example.daggerpizzeria.models.impl.PizzaChef
import com.example.daggerpizzeria.models.api.Pizza
import dagger.Module
import dagger.Provides

@Module
class PizzaProvidersModule14 {

    @Provides
    fun provideSpicyPizzaImpl(pizzaChef: PizzaChef): Pizza = SpicyPizzaImpl(pizzaChef)
}
