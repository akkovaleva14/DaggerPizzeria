package com.example.daggerpizzeria.models.impl

import android.util.Log

data class PizzaManager(private val chef: PizzaChef) {
    fun checkChef() {
        Log.d("Aleks", "Pizza manager checks the ${chef.name} pizza chef")
    }
}
