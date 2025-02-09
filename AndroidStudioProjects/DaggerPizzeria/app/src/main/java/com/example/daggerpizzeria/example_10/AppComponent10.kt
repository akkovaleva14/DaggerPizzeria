package com.example.daggerpizzeria.example_10

import com.example.daggerpizzeria.models.api.Pizza
import dagger.Component

@Component(modules = [PizzaProvidersModule10::class])
interface AppComponent10 {
    fun injectIntoApp(app: App10)

    // Явно указываем, что хотим получить пиццу
    fun pizza(): Pizza
}
