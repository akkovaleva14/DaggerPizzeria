package com.example.daggerpizzeria.example_21

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class OrderActivity @Inject constructor() : AppCompatActivity() {
    private lateinit var orderUiHelper: UiHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        val orderComponent = (application as App21)
            .appComponent
            .orderComponent()
            .create()
        orderComponent.inject(this)
        orderUiHelper = orderComponent.uiHelper()

        super.onCreate(savedInstanceState)

        orderUiHelper.showToast("Order Activity created!")
        Log.d("Aleks", "OrderActivity onCreate, UiHelper: $orderUiHelper")
    }
}

// Also OK
//class OrderActivity : AppCompatActivity() {
//    private lateinit var orderUiHelper: UiHelper
//    private lateinit var orderComponent: OrderComponent
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        val appComponent = (application as App21).appComponent
//
//        orderComponent = appComponent
//            .orderComponent()
//            .create()
//            .also { it.inject(this) }
//
//        orderUiHelper = orderComponent.uiHelper()
//
//        super.onCreate(savedInstanceState)
//
//        orderUiHelper.showToast("Order Activity created!")
//        Log.d("Aleks", "OrderActivity onCreate, UiHelper: $orderUiHelper")
//    }
//}
