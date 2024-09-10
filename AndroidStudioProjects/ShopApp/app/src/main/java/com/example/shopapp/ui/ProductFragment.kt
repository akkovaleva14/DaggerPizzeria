package com.example.shopapp.ui

import android.os.Bundle
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.domain.viewmodelfactories.ProductViewModelFactory
import com.example.domain.repositories.ProductItemRepository
import com.example.domain.viewmodels.ProductViewModel
import com.example.shopapp.databinding.FragmentProductBinding
import com.example.shopapp.adapters.ProductImageAdapter
import com.example.network.RetrofitClient
import com.example.shopapp.R

class ProductFragment : Fragment() {

    private var _binding: FragmentProductBinding? = null
    private val binding get() = _binding!!
    private lateinit var productImageAdapter: ProductImageAdapter

    private val viewModel: ProductViewModel by activityViewModels {
        ProductViewModelFactory(ProductItemRepository(RetrofitClient.apiService))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProductBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize adapter for displaying images
        productImageAdapter = ProductImageAdapter(emptyList())
        binding.productImageRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = productImageAdapter
        }

        // Get product ID from arguments
        val productId = arguments?.getString("productId") ?: return

        // Load product data
        binding.productProgressBar.visibility = View.VISIBLE // Show ProgressBar
        viewModel.loadProduct(productId)

        // Observe product LiveData
        viewModel.product.observe(viewLifecycleOwner) { product ->
            binding.productProgressBar.visibility = View.GONE // Hide ProgressBar
            if (product != null) {
                // Update UI with product data
                with(binding) {
                    productName.text = product.name
                    productPrice.text = "${product.price}₽"
                    productDiscountedPrice.text =
                        product.discountedPrice?.let { price -> "${price}₽" } ?: ""
                    productDescription.text = product.description
                    productCategory.text = product.category.joinToString(", ")

                    // Strike-through old price
                    productPrice.paintFlags = productPrice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

                    // Update adapter with product images
                    productImageAdapter = ProductImageAdapter(product.images)
                    productImageRecyclerView.adapter = productImageAdapter
                }
            } else {
                // Show error message if product is null
                binding.errorTextView.visibility = View.VISIBLE
                binding.errorTextView.text = "Product not found or an error occurred."
            }
        }

        binding.backButton.setOnClickListener {
            val bundle = Bundle().apply {
                putString("CATEGORY", arguments?.getString("CATEGORY"))
                putString("SORT_ORDER", arguments?.getString("SORT_ORDER"))
            }
            findNavController().navigate(R.id.action_productFragment_to_productListFragment, bundle)
        }

        binding.buyButton.setOnClickListener {
            Toast.makeText(
                requireContext(),
                "We are run out of this item. Sorry!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
