package com.example.daggerpizzeria.example_20

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.daggerpizzeria.R
import javax.inject.Inject

class OrderFragment : Fragment(R.layout.fragment_order) {
    // Инъекция репозитория
    @Inject
    lateinit var pizzaOrderRepository: PizzaOrderRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Ручное внедрение зависимостей
        val app = requireActivity().application as App20
        app.orderComponent.inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        pizzaOrderRepository.printRepositoryInfo()

        val tvOrders = view.findViewById<TextView>(R.id.tvOrders)
        tvOrders.text = pizzaOrderRepository.getAllOrders().joinToString("\n")
    }
}

/*
Аннотация @Inject помечает поле для внедрения
Метод inject() заполняет поле экземпляром из OrderComponent
 */