package com.example.daggerpizzeria.example_22

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpizzeria.R
import javax.inject.Inject

class MainActivity22 : AppCompatActivity() {
    @Inject
    lateinit var pizzaPresenter: PizzaPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        // Важно: инъекция перед super.onCreate()
        (application as App22).pizzaComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main22)

        Log.d("Aleks/MainActivity", "🍕 Creating Pizzas")

        // Создаем пиццу с помощью презентера
        val margherita = pizzaPresenter.createPizza("Маргарита")
        val pepperoni = pizzaPresenter.createPizza("Пепперони", 40)

        val tvPizza1: TextView = findViewById(R.id.tvPizza1)
        val tvPizza2: TextView = findViewById(R.id.tvPizza2)
        tvPizza1.text = margherita.getDescription()
        tvPizza2.text = pepperoni.getDescription()
    }
}
