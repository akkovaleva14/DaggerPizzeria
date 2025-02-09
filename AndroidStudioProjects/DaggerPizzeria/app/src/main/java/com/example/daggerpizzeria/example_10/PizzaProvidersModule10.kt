package com.example.daggerpizzeria.example_10

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.PizzaChef
import com.example.daggerpizzeria.models.impl.SpicyPizzaImpl
import dagger.Module
import dagger.Provides

@Module
class PizzaProvidersModule10(private val pizzaChef: PizzaChef) {

    @Provides
    fun providePizzaChef(): PizzaChef = pizzaChef

    @Provides
    fun provideSpicyPizza(pizzaChef: PizzaChef): Pizza = SpicyPizzaImpl(pizzaChef)
}
