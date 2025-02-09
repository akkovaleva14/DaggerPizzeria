package com.example.daggerpizzeria.example_17

import dagger.Module
import dagger.Provides

@Module
class InfoModule17 {
    @Provides
    fun providePizzaInfo(pizzaType: String): Info {
        return Info(
            pizzaStyle = "Итальянская",
            pizzaType = pizzaType
        )
    }
}