package com.example.daggerpizzeria.example_13

import com.example.daggerpizzeria.models.impl.PizzaChef
import com.example.daggerpizzeria.models.impl.PizzaManager
import dagger.BindsInstance
import dagger.Component

@Component(modules = [PizzaProvidersModule13::class, PizzaManagerProvidersModule13::class])
interface AppComponent13 {
    fun injectIntoApp(app: App13)
    fun getPizzaManager(): PizzaManager

    @Component.Builder
    interface AppComponentCustomBuilder {
        fun customBuildAppComp(): AppComponent13

        @BindsInstance
        fun setPizzaChefToComponent(pizzaChef: PizzaChef): AppComponentCustomBuilder
    }
}
