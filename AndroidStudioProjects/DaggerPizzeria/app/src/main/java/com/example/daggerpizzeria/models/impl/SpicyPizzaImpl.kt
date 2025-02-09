package com.example.daggerpizzeria.models.impl

import android.util.Log
import com.example.daggerpizzeria.models.api.Pizza
import javax.inject.Inject

class SpicyPizzaImpl @Inject constructor(private val pizzaChef: PizzaChef) : Pizza {
    override fun prepare() {
        Log.d("Aleks", "Preparing Spicy pizza by chef ${pizzaChef.name}")
    }

    override fun serve() {
        Log.d("Aleks", "Serving Spicy pizza prepared by chef ${pizzaChef.name}")
    }
}