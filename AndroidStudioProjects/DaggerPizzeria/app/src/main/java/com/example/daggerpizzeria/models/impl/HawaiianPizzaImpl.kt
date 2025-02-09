package com.example.daggerpizzeria.models.impl

import com.example.daggerpizzeria.models.api.Pizza
import javax.inject.Inject

class HawaiianPizzaImpl @Inject constructor(): Pizza {
    override fun prepare() {
        println("Hawaiian Pizza prepared")
    }

    override fun serve() {
        println("Hawaiian Pizza served")
    }
}