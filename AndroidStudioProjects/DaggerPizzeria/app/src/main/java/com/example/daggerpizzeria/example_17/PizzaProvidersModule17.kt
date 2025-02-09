package com.example.daggerpizzeria.example_17

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.impl.MargheritaPizzaImpl
import dagger.Module
import dagger.Provides

@Module
class PizzaProvidersModule17 {
    @Provides
    fun providePizzaStyle(): Pizza = MargheritaPizzaImpl()
}

/*
Предоставляет зависимость Pizza
Аннотация @Provides указывает, как создавать объекты
 */