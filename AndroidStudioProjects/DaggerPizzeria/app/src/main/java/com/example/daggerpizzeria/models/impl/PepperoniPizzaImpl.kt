package com.example.daggerpizzeria.models.impl

import android.util.Log
import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.api.Sauce

class PepperoniPizzaImpl(private val sauce: Sauce? = null) : Pizza {
    override fun prepare() {
        val sauceDescription = sauce?.describe() ?: "no specific sauce"
        Log.d("Aleks", "Preparing Pepperoni pizza with $sauceDescription")
    }

    override fun serve() {
        Log.d("Aleks", "Serving Pepperoni pizza")
    }
}