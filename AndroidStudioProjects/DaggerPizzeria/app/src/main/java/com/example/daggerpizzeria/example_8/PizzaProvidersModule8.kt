package com.example.daggerpizzeria.example_8

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.api.Sauce
import com.example.daggerpizzeria.models.impl.MargheritaPizzaImpl
import com.example.daggerpizzeria.models.impl.PepperoniPizzaImpl
import com.example.daggerpizzeria.models.impl.VegetarianPizzaImpl
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
class PizzaProvidersModule8 {

    @Provides
    @IntoMap
    @StringKey("key_Vegetarian")
    fun provideVegetarianPizzaImpl(sauce: Sauce): Pizza = VegetarianPizzaImpl(sauce)

    @Provides
    @IntoMap
    @StringKey("key_Pepperoni")
    fun providePepperoniPizzaImpl(): Pizza = PepperoniPizzaImpl()

    @Provides
    @IntoMap
    @StringKey("key_Margherita")
    fun provideMargheritaPizzaImpl(): Pizza = MargheritaPizzaImpl()
}
