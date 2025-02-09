package com.example.daggerpizzeria.example_7
import dagger.Component

@Component(modules = [
    PizzaBindingsModule7::class,
    PizzaProvidersModule7::class,
    SauceModule7::class
])
interface AppComponent7 {
    fun injectIntoApp(app: App7)
    //    fun getSetOfPizzas(): Set<@JvmSuppressWildcards Pizza>
}