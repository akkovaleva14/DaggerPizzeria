package com.example.daggerpizzeria.example_4

import dagger.Component

@Component(modules = [PizzaModule4::class, SauceModule4::class])
interface AppComponent4 {
    fun injectIntoApp(app: App4)
}