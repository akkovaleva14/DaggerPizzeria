package com.example.daggerpizzeria.example_22

import android.util.Log
import javax.inject.Inject

class PizzaPresenter @Inject constructor(
    private val ingredients: PizzaIngredients
) {
    init {
        Log.d("Aleks/PizzaPresenter", "🚀 PizzaPresenter Initialized")
        Log.d("Aleks/PizzaPresenter", "   - Ingredients injected: $ingredients")
        PizzaFactory.logFactoryCreation()
    }

    fun createPizza(name: String, size: Int = 30): Pizza {
        Log.d("Aleks/PizzaPresenter", "🍽️ Creating Pizza:")
        Log.d("Aleks/PizzaPresenter", "   - Name: $name")
        Log.d("Aleks/PizzaPresenter", "   - Size: $size")

        return Pizza(ingredients, name, size)
    }
}