package com.example.daggerpizzeria.example_13

import com.example.daggerpizzeria.models.impl.PizzaChef
import com.example.daggerpizzeria.models.impl.PizzaManager
import dagger.Module
import dagger.Provides

@Module
class PizzaManagerProvidersModule13 {

    @Provides
    fun providePizzaManager(chef: PizzaChef): PizzaManager = PizzaManager(chef)
}