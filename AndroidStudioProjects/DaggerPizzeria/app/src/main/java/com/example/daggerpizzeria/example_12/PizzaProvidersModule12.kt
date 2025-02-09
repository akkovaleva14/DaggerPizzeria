package com.example.daggerpizzeria.example_12

import com.example.daggerpizzeria.models.impl.SpicyPizzaImpl
import com.example.daggerpizzeria.models.impl.PizzaChef
import com.example.daggerpizzeria.models.api.Pizza
import dagger.Module
import dagger.Provides

@Module
class PizzaProvidersModule12(private val pizzaChef: PizzaChef) {

    @Provides
    fun provideSpicyPizzaImpl(): Pizza = SpicyPizzaImpl(pizzaChef)

    /**
     * Внимание! Именно этот метод передает pizzaChef в граф зависимостей.
     * Только теперь прочие модули компонента смогут использовать pizzaChef.
     */
    @Provides
    fun providePizzaChef(): PizzaChef = pizzaChef
}
