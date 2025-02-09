package com.example.daggerpizzeria.models.impl

import com.example.daggerpizzeria.models.api.Pizza
import com.example.daggerpizzeria.models.api.Sauce

class VegetarianPizzaImpl(private val sauce: Sauce): Pizza {
    override fun prepare() {
        println("Vegetarian Pizza prepared with ${sauce.javaClass.simpleName}")
    }

    override fun serve() {
        println("Vegetarian Pizza served with ${sauce.javaClass.simpleName}")
    }
}