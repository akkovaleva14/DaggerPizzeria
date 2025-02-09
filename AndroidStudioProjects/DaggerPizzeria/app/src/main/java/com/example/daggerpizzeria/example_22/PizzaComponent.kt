package com.example.daggerpizzeria.example_22

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [PizzaModule::class])
interface PizzaComponent {
    fun pizzaPresenter(): PizzaPresenter
    fun inject(activity: MainActivity22)

    @Component.Factory
    interface Factory {
        fun create(): PizzaComponent
    }
}
