package com.example.daggerpizzeria.example_16

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.daggerpizzeria.R

class FirstFragment16: Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val etPizzaType = view.findViewById<EditText>(R.id.etPizzaType)
        view.findViewById<Button>(R.id.btnSendData).setOnClickListener {
            val pizzaType = etPizzaType.editableText.toString()
            if (pizzaType.isNotBlank()) {
                (activity as? FirstFragmentContract)?.onButtonSendDataClicked(pizzaType)
            }
        }
    }
}
