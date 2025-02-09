package com.example.daggerpizzeria.example_18

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.daggerpizzeria.R

class FirstFragment18: Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val etPizzaType = view.findViewById<EditText>(R.id.etPizzaType)
        val btnSendData = view.findViewById<Button>(R.id.btnSendData)

        btnSendData.setOnClickListener {
            val pizzaType = etPizzaType.text.toString().trim()

            if (pizzaType.isNotBlank()) {
                Toast.makeText(requireContext(), "Выбрана пицца: $pizzaType", Toast.LENGTH_SHORT).show()
                (activity as? FirstFragmentContract)?.onButtonSendDataClicked(pizzaType)
            } else {
                Toast.makeText(requireContext(), "Введите тип пиццы", Toast.LENGTH_SHORT).show()
            }
        }
    }
}