package com.example.daggerpizzeria.example_12.di

import com.example.daggerpizzeria.models.impl.PizzaChef
import com.example.daggerpizzeria.models.impl.PizzaManager
import dagger.Module
import dagger.Provides

@Module
class PizzaManagerProvidersModule12 {

    @Provides
    fun providePizzaManager(chef: PizzaChef): PizzaManager = PizzaManager(chef)
}
