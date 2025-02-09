package com.example.daggerpizzeria.example_4

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.api.Sauce
import com.example.daggerpizzeria.models.impl.PepperoniPizzaImpl
import dagger.Module
import dagger.Provides

@Module
class PizzaModule4 {
    @Provides
    fun providePepperoniPizza(sauce: Sauce): Pizza = PepperoniPizzaImpl(sauce)
}
/*
Описывает, как создавать Pizza
Требует Sauce для создания PepperoniPizzaImpl
 */