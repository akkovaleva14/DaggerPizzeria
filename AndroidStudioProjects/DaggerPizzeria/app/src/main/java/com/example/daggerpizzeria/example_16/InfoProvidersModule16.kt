package com.example.daggerpizzeria.example_16

import com.example.daggerpizzeria.models.api.Pizza
import dagger.Module
import dagger.Provides

@Module
class InfoProvidersModule16(private val pizzaType: String) {
    @Provides
    fun provideInfo(pizza: Pizza): Info {
        return Info(pizzaStyle = pizza.javaClass.simpleName.removeSuffix("PizzaImpl"), pizzaType = pizzaType)
    }
}
/* Модуль для субкомпонента
Принимает pizzaType в конструкторе
Создает объект Info с использованием внедренной зависимости Pizza
 */