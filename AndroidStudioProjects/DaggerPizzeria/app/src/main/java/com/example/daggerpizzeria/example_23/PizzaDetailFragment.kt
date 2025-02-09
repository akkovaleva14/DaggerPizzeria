package com.example.daggerpizzeria.example_23

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.daggerpizzeria.R
import javax.inject.Inject

class PizzaDetailFragment : Fragment(R.layout.fragment_pizza_detail) {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var customPizzaViewModelFactory: CustomPizzaViewModelFactory

    private lateinit var standardPizzaViewModel: StandardPizzaViewModel
    private lateinit var customPizzaViewModel: CustomPizzaViewModel

    private lateinit var customPizzaDescriptionTextView: TextView
    private lateinit var basePizzaDescriptionTextView: TextView
    private lateinit var pizzaDescriptionTextView: TextView

    companion object {
        private const val ARG_PIZZA_SIZE = "pizza_size"
        private const val ARG_PIZZA_SHAPE = "pizza_shape"

        fun newInstance(pizzaSize: String, pizzaShape: String): PizzaDetailFragment {
            return PizzaDetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PIZZA_SIZE, pizzaSize)
                    putString(ARG_PIZZA_SHAPE, pizzaShape)
                }
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        when (context) {
            is PizzaDetailActivity -> {
                context.pizzaComponent.inject(this)
                val componentHashCode = context.pizzaComponent.hashCode()
                Log.d("Aleks/PizzaFragment", "💉 Injection from PizzaDetailActivity. Component ID: $componentHashCode")
            }
            else -> {
                Log.e("Aleks/PizzaFragment", "⚠️ Unsupported context type for injection")
                throw IllegalArgumentException("Unsupported activity type")
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pizzaSize = arguments?.getString(ARG_PIZZA_SIZE)
        val pizzaShape = arguments?.getString(ARG_PIZZA_SHAPE)

        customPizzaDescriptionTextView = view.findViewById(R.id.customPizzaDescriptionTextView)
        standardPizzaViewModel = ViewModelProvider(this, viewModelFactory)[StandardPizzaViewModel::class.java]

        basePizzaDescriptionTextView = view.findViewById(R.id.basePizzaDescriptionTextView)
        pizzaDescriptionTextView = view.findViewById(R.id.pizzaDescriptionTextView)

        val selectedSize = arguments?.getString(ARG_PIZZA_SIZE) ?: "Средняя"
        val sizeInCm = when(selectedSize) {
            "Маленькая" -> 25
            "Большая" -> 40
            else -> 30
        }
        customPizzaViewModel = customPizzaViewModelFactory.create("АмНям", sizeInCm)

        pizzaDescriptionTextView.text = "Ваш заказ: $selectedSize пицца, $pizzaShape"
        customPizzaDescriptionTextView.text = customPizzaViewModel.getCustomPizzaDescription()
        basePizzaDescriptionTextView.text = standardPizzaViewModel.getPizzaDescription()

    }
}
