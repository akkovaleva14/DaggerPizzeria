package com.example.daggerpizzeria.example_1

import com.example.daggerpizzeria.models.impl.PizzaManager
import com.example.daggerpizzeria.models.impl.PizzaChef
import dagger.Module
import dagger.Provides

@Module
class PizzaManagerProvidersModule11 {

    @Provides
    fun providePizzaManager(pizzaChef: PizzaChef): PizzaManager = PizzaManager(pizzaChef)
}
