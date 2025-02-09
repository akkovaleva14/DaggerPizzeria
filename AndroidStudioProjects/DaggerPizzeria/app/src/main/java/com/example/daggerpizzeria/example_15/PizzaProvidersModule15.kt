package com.example.daggerpizzeria.example_15

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.MargheritaPizzaImpl
import dagger.Module
import dagger.Provides

@Module
class PizzaProvidersModule15 {

    @Provides
    fun provideMargheritaPizzaImpl(): Pizza = MargheritaPizzaImpl()
}
