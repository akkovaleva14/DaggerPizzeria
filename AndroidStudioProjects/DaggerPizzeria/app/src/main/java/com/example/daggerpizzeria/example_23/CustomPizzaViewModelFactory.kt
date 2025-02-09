package com.example.daggerpizzeria.example_23

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import kotlin.Int

@AssistedFactory
interface CustomPizzaViewModelFactory {
    fun create(
        @Assisted("name") name: String,
        @Assisted("size") size: Int = 30
    ): CustomPizzaViewModel
}
