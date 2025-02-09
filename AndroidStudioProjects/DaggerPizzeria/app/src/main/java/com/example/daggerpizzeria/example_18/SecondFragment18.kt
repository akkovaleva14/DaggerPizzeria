package com.example.daggerpizzeria.example_18

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.daggerpizzeria.R

class SecondFragment18 : Fragment(R.layout.fragment_second) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvPizzaType = view.findViewById<TextView>(R.id.tvPizzaType)
        tvPizzaType.text = (requireContext().applicationContext as App18)
            .infoSubcomponent
            .getInfo()
            .pizzaType
    }
}