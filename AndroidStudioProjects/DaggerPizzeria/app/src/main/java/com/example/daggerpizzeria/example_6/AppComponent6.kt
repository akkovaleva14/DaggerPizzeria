package com.example.daggerpizzeria.example_6

import dagger.Component

@Component(modules = [
    PizzaBindingsModule6::class,
    PizzaProvidersModule6::class,
    SauceModule6::class
])
interface AppComponent6 {
    fun injectIntoApp(app: App6)
}