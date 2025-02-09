package com.example.daggerpizzeria.example_23

import androidx.lifecycle.ViewModel
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

class CustomPizzaViewModel @AssistedInject constructor(
    private val ingredients: PizzaIngredients,
    @Assisted("name") private val pizzaName: String,
    @Assisted("size") private val pizzaSize: Int
) : ViewModel() {

    fun getCustomPizzaDescription(): String =
        "Кастомная пицца:\n '$pizzaName', размер $pizzaSize см, " +
                "ингредиенты ${ingredients.cheese} и ${ingredients.sauce}"
}
