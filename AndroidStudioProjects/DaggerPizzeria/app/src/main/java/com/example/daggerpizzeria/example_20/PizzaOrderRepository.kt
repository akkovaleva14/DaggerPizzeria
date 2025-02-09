package com.example.daggerpizzeria.example_20

import android.util.Log
import java.util.UUID
import javax.inject.Inject

@AppScope
class PizzaOrderRepository @Inject constructor() {
    private val orders = mutableListOf<String>()
    private val creationTime = System.currentTimeMillis()
    private val instanceId = UUID.randomUUID().toString()

    fun addOrder(pizzaType: String) {
        orders.add(pizzaType)
    }

    fun getAllOrders(): List<String> = orders

    fun printRepositoryInfo() {
        Log.d("Aleks", "Repository Instance ID: $instanceId")
        Log.d("Aleks", "Repository created at: $creationTime")
        Log.d("Aleks", "Total orders: ${orders.size}")
    }
}
