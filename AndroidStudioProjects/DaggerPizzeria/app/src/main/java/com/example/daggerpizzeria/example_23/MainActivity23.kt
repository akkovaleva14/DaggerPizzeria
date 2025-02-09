package com.example.daggerpizzeria.example_23

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.daggerpizzeria.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputLayout

class MainActivity23 : AppCompatActivity() {

    private lateinit var pizzaComponent: PizzaComponent
    private lateinit var shapeViewModel: ShapeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        pizzaComponent = (application as App23)
            .appComponent
            .pizzaComponent()
            .create(this)
        pizzaComponent.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)

        // Получение ViewModel через ViewModelProvider
        shapeViewModel = ViewModelProvider(
            this,
            pizzaComponent.provideViewModelFactory()
        )[ShapeViewModel::class.java]

        val shapeInputLayout = findViewById<TextInputLayout>(R.id.shapeInputLayout)
        val shapeDropdown = findViewById<AutoCompleteTextView>(R.id.shapeDropdown)
        val shapeAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            ShapeViewModel.SHAPES
        )
        shapeDropdown.setAdapter(shapeAdapter)

        shapeDropdown.setOnClickListener {
            shapeInputLayout.error = null
        }

        shapeDropdown.setOnItemClickListener { _, _, position, _ ->
            val selectedShape = ShapeViewModel.SHAPES[position]
            shapeInputLayout.error = null
            shapeViewModel.selectShape(selectedShape)
        }

        val pizzaSizeInputLayout = findViewById<TextInputLayout>(R.id.pizzaSizeInputLayout)
        val pizzaSizeDropdown = findViewById<AutoCompleteTextView>(R.id.pizzaSizeDropdown)
        val pizzaSizes = arrayOf("Маленькая", "Средняя", "Большая")
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            pizzaSizes
        )
        pizzaSizeDropdown.setAdapter(adapter)
        pizzaSizeDropdown.setOnClickListener {
            pizzaSizeInputLayout.error = null
        }
        pizzaSizeDropdown.setOnItemClickListener { _, _, _, _ ->
            pizzaSizeInputLayout.error = null
        }

        val orderButton = findViewById<MaterialButton>(R.id.orderButton)
        orderButton.setOnClickListener {
            val selectedSize = pizzaSizeDropdown.text.toString()
            val selectedShape = shapeDropdown.text.toString()

            if (selectedSize.isNotEmpty() && selectedShape.isNotEmpty()) {
                val intent = PizzaDetailActivity.newIntent(
                    this,
                    selectedSize,
                    selectedShape
                )
                startActivity(intent)
            } else {
                if (selectedSize.isEmpty()) {
                    pizzaSizeInputLayout.error = "Выберите размер пиццы"
                }
                if (selectedShape.isEmpty()) {
                    shapeInputLayout.error = "Выберите форму пиццы"
                }
            }
        }
    }
}