package com.example.daggerpizzeria.example_16

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.MargheritaPizzaImpl
import dagger.Module
import dagger.Provides

@Module
class PizzaProvidersModule16 {

    @Provides
    fun provideMargheritaPizzaImpl(): Pizza = MargheritaPizzaImpl()
}
