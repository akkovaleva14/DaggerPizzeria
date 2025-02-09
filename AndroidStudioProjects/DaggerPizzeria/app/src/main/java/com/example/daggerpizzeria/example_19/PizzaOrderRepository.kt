package com.example.daggerpizzeria.example_19

import android.annotation.SuppressLint
import android.util.Log
import java.util.UUID
import javax.inject.Inject

// 2. Репозиторий для работы с заказами пиццы
@OrderScope
class PizzaOrderRepository @Inject constructor() {
    private val orders = mutableListOf<String>()
    private val creationTime = System.currentTimeMillis()
    private val instanceId = UUID.randomUUID().toString()

    fun addOrder(pizzaType: String) {
        orders.add(pizzaType)
    }

    fun getAllOrders(): List<String> = orders

    @SuppressLint("LogNotTimber")
    fun printOrderInfo() {
        Log.d("Aleks", "Repository Instance ID: $instanceId")
        Log.d("Aleks", "Repository created at: $creationTime")
        Log.d("Aleks", "Total orders: ${orders.size}")
    }
}