package com.example.daggerpizzeria.example_22

import android.util.Log
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object PizzaModule {
    @Provides
    @Singleton
    fun providePizzaIngredients(): PizzaIngredients {
        Log.d("Aleks/PizzaModule", "🧀 Providing PizzaIngredients")
        return PizzaIngredients()
    }

    @Provides
    @Singleton
    fun providePizzaPresenter(ingredients: PizzaIngredients): PizzaPresenter {
        Log.d("Aleks/PizzaModule", "👨‍🍳 Providing PizzaPresenter")
        return PizzaPresenter(ingredients)
    }
}
