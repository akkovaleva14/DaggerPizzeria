package com.example.daggerpizzeria.example_20

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.daggerpizzeria.R

class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnSendData).setOnClickListener {
            val pizzaType = view.findViewById<EditText>(R.id.etPizzaType).text.toString()

            if (pizzaType.isNotBlank()) {
                // Получение репозитория через OrderComponent
                val app = requireActivity().application as App20
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

/*
Получение OrderComponent через App20
Вызов метода получения репозитория
Добавление заказа в тот же экземпляр репозитория
 */