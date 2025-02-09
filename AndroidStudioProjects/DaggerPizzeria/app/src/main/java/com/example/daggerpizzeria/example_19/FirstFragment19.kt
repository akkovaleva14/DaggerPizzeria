package com.example.daggerpizzeria.example_19

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.daggerpizzeria.R

// 9. Первый фрагмент для ввода заказа
class FirstFragment19 : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: android.view.View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<android.widget.Button>(R.id.btnSendData).setOnClickListener {
            val pizzaType = view.findViewById<android.widget.EditText>(R.id.etPizzaType).text.toString()

            if (pizzaType.isNotBlank()) {
                val app = requireActivity().application as App19
                app.orderComponent
                    .getPizzaOrderRepository()
                    .addOrder(pizzaType)

                parentFragmentManager.beginTransaction()
                    .replace(R.id.root, OrderFragment())
                    .addToBackStack(null)
                    .commit()
            }
        }
    }
}