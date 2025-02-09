package com.example.daggerpizzeria.example_11

import com.example.daggerpizzeria.models.impl.SpicyPizzaImpl
import com.example.daggerpizzeria.models.impl.PizzaChef
import com.example.daggerpizzeria.models.api.Pizza
import dagger.Module
import dagger.Provides

@Module
class PizzaProvidersModule11(private val pizzaChef: PizzaChef) {

    @Provides
    fun provideSpicyPizza(): Pizza = SpicyPizzaImpl(pizzaChef)

    /**
     * Этот метод передает pizzaChef в граф зависимостей.
     * Теперь другие модули компонента смогут использовать pizzaChef.
     */
    @Provides
    fun providePizzaChef(): PizzaChef = pizzaChef
}
