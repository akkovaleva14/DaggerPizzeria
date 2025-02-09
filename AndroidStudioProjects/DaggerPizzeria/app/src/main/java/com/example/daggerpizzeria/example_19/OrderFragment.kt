package com.example.daggerpizzeria.example_19

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.daggerpizzeria.R
import javax.inject.Inject

// 10. Фрагмент для отображения заказов
class OrderFragment : Fragment(R.layout.fragment_order) {
    @Inject
    lateinit var pizzaOrderRepository: PizzaOrderRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val app = requireActivity().application as App19
        app.orderComponent.inject(this)
    }

    override fun onViewCreated(view: android.view.View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pizzaOrderRepository.printOrderInfo()

        val tvOrders = view.findViewById<android.widget.TextView>(R.id.tvOrders)
        tvOrders.text = pizzaOrderRepository.getAllOrders().joinToString("\n")
    }
}

/*
Использует @Inject для внедрения зависимости
Вызывает inject() для ручного внедрения зависимостей
 */