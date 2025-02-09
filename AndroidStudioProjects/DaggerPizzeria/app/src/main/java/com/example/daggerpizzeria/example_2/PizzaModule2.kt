package com.example.daggerpizzeria.example_2

import com.example.daggerpizzeria.models.impl.MargheritaPizzaImpl
import com.example.daggerpizzeria.models.api.Pizza
import dagger.Module
import dagger.Provides

@Module
class PizzaModule2 {
    @Provides
    fun provideMargherita(): Pizza = MargheritaPizzaImpl()
}