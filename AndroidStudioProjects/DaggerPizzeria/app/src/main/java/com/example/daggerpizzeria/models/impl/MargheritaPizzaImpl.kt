package com.example.daggerpizzeria.models.impl

import android.util.Log
import com.example.daggerpizzeria.models.api.Pizza

class MargheritaPizzaImpl: Pizza {
    override fun prepare() {
        Log.d("Aleks", "Margherita Pizza prepared")
    }
    override fun serve() {
        Log.d("Aleks", "Serving Margherita pizza")
    }
}

/* Реализация зависимости
Конкретная реализация интерфейса Pizza
Будет создаваться и внедряться Dagger
 */