package com.example.daggerpizzeria.example_8

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.HawaiianPizzaImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
interface PizzaBindingsModule8 {
    @Binds
    @IntoMap
    @StringKey("key_Hawaiian")
    fun bindHawaiianPizzaImpl(pizza: HawaiianPizzaImpl): Pizza
}
