package com.example.daggerpizzeria.example_3

import com.example.daggerpizzeria.models.impl.PepperoniPizzaImpl
import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.api.Sauce
import dagger.Module
import dagger.Provides

@Module
class PizzaModule3 {
    // Провайдер создает экземпляр Pizza с зависимостью от Sauce
    @Provides
    fun providePepperoniPizzaWithSauce(sauce: Sauce): Pizza = PepperoniPizzaImpl(sauce)
}