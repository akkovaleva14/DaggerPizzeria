package com.example.daggerpizzeria.example_8

import dagger.Component

@Component(modules = [
    PizzaBindingsModule8::class,
    PizzaProvidersModule8::class,
    SauceModule8::class
])
interface AppComponent8 {
    fun injectIntoApp(app: App8)
    //    fun getMapOfPizzas(): Map<@JvmSuppressWildcards Pizza>
}
