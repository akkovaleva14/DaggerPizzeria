package com.example.daggerpizzeria.example_12.di

import com.example.daggerpizzeria.example_12.App12
import com.example.daggerpizzeria.example_12.PizzaProvidersModule12
import com.example.daggerpizzeria.models.impl.PizzaManager
import dagger.Component

@Component(modules = [PizzaProvidersModule12::class, PizzaManagerProvidersModule12::class])
interface AppComponent12 {
    fun injectIntoApp(app: App12)
    fun getPizzaManager(): PizzaManager

    @Component.Builder
    interface AppComponentCustomBuilder {
        fun customBuildAppComp(): AppComponent12
        fun customSetPizzaProvidersModule(pizzaProvidersModule: PizzaProvidersModule12): AppComponentCustomBuilder
    }
}
