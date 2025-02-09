package com.example.daggerpizzeria.example_11

import com.example.daggerpizzeria.example_1.PizzaManagerProvidersModule11
import com.example.daggerpizzeria.models.impl.PizzaManager
import dagger.Component

@Component(modules = [PizzaProvidersModule11::class, PizzaManagerProvidersModule11::class])
interface AppComponent11 {
    fun injectIntoApp(app: App11)
    fun getPizzaManager(): PizzaManager
}
