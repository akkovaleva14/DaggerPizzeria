package com.example.daggerpizzeria.example_5

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.api.Sauce
import com.example.daggerpizzeria.models.impl.PepperoniPizzaImpl
import com.example.daggerpizzeria.models.impl.MargheritaPizzaImpl
import com.example.daggerpizzeria.models.impl.VegetarianPizzaImpl
import dagger.Module
import dagger.Provides
import javax.inject.Named

// @Provides используется для создания сложных объектов
// Каждый метод - способ создания зависимости
@Module
class PizzaProvidersModule5 {

    @Named("Vegetarian")
    @Provides
    fun provideVegetarianPizzaImpl(sauce: Sauce): Pizza = VegetarianPizzaImpl(sauce)
    // Создание вегетарианской пиццы с соусом

    @Named("Pepperoni")
    @Provides
    fun providePepperoniPizzaImpl(): Pizza = PepperoniPizzaImpl()
    // Простое создание пиццы Пепперони

    @Named("Margherita")
    @Provides
    fun provideMargheritaPizzaImpl(): Pizza = MargheritaPizzaImpl()
}