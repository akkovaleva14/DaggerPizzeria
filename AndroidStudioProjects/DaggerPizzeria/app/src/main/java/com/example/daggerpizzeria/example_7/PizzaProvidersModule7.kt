package com.example.daggerpizzeria.example_7

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.api.Sauce
import com.example.daggerpizzeria.models.impl.MargheritaPizzaImpl
import com.example.daggerpizzeria.models.impl.PepperoniPizzaImpl
import com.example.daggerpizzeria.models.impl.VegetarianPizzaImpl
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class PizzaProvidersModule7 {

    @Provides
    @IntoSet
    fun provideVegetarianPizzaImpl(sauce: Sauce): Pizza = VegetarianPizzaImpl(sauce)

    @Provides
    @IntoSet
    fun providePepperoniPizzaImpl(): Pizza = PepperoniPizzaImpl()

    @Provides
    @IntoSet
    fun provideMargheritaPizzaImpl(): Pizza = MargheritaPizzaImpl()
}