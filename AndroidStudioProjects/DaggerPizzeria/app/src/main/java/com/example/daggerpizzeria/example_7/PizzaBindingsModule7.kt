package com.example.daggerpizzeria.example_7

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.HawaiianPizzaImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
interface PizzaBindingsModule7 {
    @Binds
    @IntoSet
    fun bindHawaiianPizzaImpl(pizza: HawaiianPizzaImpl): Pizza
}