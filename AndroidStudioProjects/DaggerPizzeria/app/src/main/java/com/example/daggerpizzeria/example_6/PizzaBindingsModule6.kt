package com.example.daggerpizzeria.example_6

import com.example.daggerpizzeria.Hawaiian
import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.HawaiianPizzaImpl
import dagger.Binds
import dagger.Module

@Module
interface PizzaBindingsModule6 {
    @Hawaiian
    @Binds
    fun bindHawaiianPizzaImpl(pizza: HawaiianPizzaImpl): Pizza
}