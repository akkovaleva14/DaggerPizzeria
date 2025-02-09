package com.example.daggerpizzeria.example_5

import com.example.daggerpizzeria.models.impl.HawaiianPizzaImpl
import com.example.daggerpizzeria.models.api.Pizza
import dagger.Binds
import dagger.Module
import javax.inject.Named

// @Binds используется для простой привязки реализации к интерфейсу
// @Named("Hawaiian") позволяет иметь несколько реализаций Pizza
@Module
interface PizzaBindingsModule5 {
    @Named("Hawaiian")
    @Binds
    fun bindHawaiianPizzaImpl(pizza: HawaiianPizzaImpl): Pizza
    // Говорим Dagger: когда просят Pizza с квалификатором "Hawaiian",
    // используй HawaiianPizzaImpl
}