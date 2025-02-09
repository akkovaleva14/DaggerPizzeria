package com.example.daggerpizzeria.example_14

import com.example.daggerpizzeria.models.impl.PizzaChef
import com.example.daggerpizzeria.models.impl.PizzaManager
import dagger.BindsInstance
import dagger.Component

@Component(modules = [PizzaProvidersModule14::class, PizzaManagerProvidersModule14::class])
interface AppComponent14 {
    fun injectIntoApp(app: App14)
    fun getPizzaManager(): PizzaManager

    @Component.Factory
    interface AppComponentCustomFactory {
        fun create(@BindsInstance pizzaChef: PizzaChef): AppComponent14
    }
}
