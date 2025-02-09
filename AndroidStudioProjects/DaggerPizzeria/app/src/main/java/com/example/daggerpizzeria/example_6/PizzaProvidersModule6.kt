package com.example.daggerpizzeria.example_6

import com.example.daggerpizzeria.Margherita
import com.example.daggerpizzeria.Pepperoni
import com.example.daggerpizzeria.Vegetarian
import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.api.Sauce
import com.example.daggerpizzeria.models.impl.MargheritaPizzaImpl
import com.example.daggerpizzeria.models.impl.PepperoniPizzaImpl
import com.example.daggerpizzeria.models.impl.VegetarianPizzaImpl
import dagger.Module
import dagger.Provides

@Module
class PizzaProvidersModule6 {

    @Vegetarian
    @Provides
    fun provideVegetarianPizzaImpl(sauce: Sauce): Pizza = VegetarianPizzaImpl(sauce)

    @Pepperoni
    @Provides
    fun providePepperoniPizzaImpl(): Pizza = PepperoniPizzaImpl()

    @Margherita
    @Provides
    fun provideMargheritaPizzaImpl(): Pizza = MargheritaPizzaImpl()
}