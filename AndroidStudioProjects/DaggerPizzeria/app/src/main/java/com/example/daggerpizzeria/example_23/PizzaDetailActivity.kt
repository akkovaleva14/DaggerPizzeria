package com.example.daggerpizzeria.example_23

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpizzeria.R
import com.google.android.material.appbar.MaterialToolbar

class PizzaDetailActivity : AppCompatActivity() {
    lateinit var pizzaComponent: PizzaComponent

    companion object {
        private const val EXTRA_PIZZA_SIZE = "pizza_size"
        private const val EXTRA_PIZZA_SHAPE = "pizza_shape"

        fun newIntent(
            context: Context,
            pizzaSize: String,
            pizzaShape: String
        ): Intent {
            return Intent(context, PizzaDetailActivity::class.java).apply {
                putExtra(EXTRA_PIZZA_SIZE, pizzaSize)
                putExtra(EXTRA_PIZZA_SHAPE, pizzaShape)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        pizzaComponent = (application as App23)
            .appComponent
            .pizzaComponent()
            .create(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_detail)

        val pizzaSize = intent.getStringExtra(EXTRA_PIZZA_SIZE)
        val pizzaShape = intent.getStringExtra(EXTRA_PIZZA_SHAPE)

        val componentHashCode = pizzaComponent.hashCode()
        Log.d("Aleks/PizzaDetailActivity", "🍽️ PizzaComponent created. Instance ID: $componentHashCode")

        val toolbar = findViewById<MaterialToolbar>(R.id.topAppBar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, PizzaDetailFragment.newInstance(pizzaSize!!, pizzaShape!!))
                .commit()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
