package com.example.daggerpizzeria.example_23

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class StandardPizzaViewModel @Inject constructor(
    private val ingredients: PizzaIngredients
) : ViewModel() {

    fun getPizzaDescription(): String =
        "Стандартная пицца:\n ингредиенты ${ingredients.cheese} и ${ingredients.sauce}"
}
