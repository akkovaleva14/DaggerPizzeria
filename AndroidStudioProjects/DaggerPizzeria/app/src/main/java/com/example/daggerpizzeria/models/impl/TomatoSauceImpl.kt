package com.example.daggerpizzeria.models.impl

import com.example.daggerpizzeria.models.api.Sauce

class TomatoSauceImpl : Sauce {
    override fun describe(): String = "Tomato sauce with fresh herbs"
}