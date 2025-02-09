package com.example.daggerpizzeria.example_22

import android.util.Log
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

class Pizza @AssistedInject constructor(
    // Зависимость от Dagger
    private val ingredients: PizzaIngredients,
    // Runtime-параметры, помеченные @Assisted
    @Assisted("name") val name: String,
    @Assisted("size") val size: Int
) {

    init {
        Log.d("Aleks/AssistedInject", "🍕 Pizza Constructor Called")
        Log.d("Aleks/AssistedInject", "📋 Injected Dependencies:")
        Log.d("Aleks/AssistedInject", "   - Ingredients: $ingredients")
        Log.d("Aleks/AssistedInject", "📝 Assisted Parameters:")
        Log.d("Aleks/AssistedInject", "   - Name: $name")
        Log.d("Aleks/AssistedInject", "   - Size: $size")
    }

    fun getDescription(): String =
        "Пицца $name, размер $size см, сыр: ${ingredients.cheese}, соус: ${ingredients.sauce}"
}
