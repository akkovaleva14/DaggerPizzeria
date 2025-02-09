package com.example.daggerpizzeria.example_22

import android.util.Log
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory

@AssistedFactory
interface PizzaFactory {
    fun create(
        @Assisted("name") name: String,
        @Assisted("size") size: Int = 30
    ): Pizza

    companion object {
        fun logFactoryCreation() {
            Log.d("Aleks/AssistedFactory", "🏭 PizzaFactory Created")
            Log.d("Aleks/AssistedFactory", "   - Factory allows dynamic Pizza creation")
        }
    }

}