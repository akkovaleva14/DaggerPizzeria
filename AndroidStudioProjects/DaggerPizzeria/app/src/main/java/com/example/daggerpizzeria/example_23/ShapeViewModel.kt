package com.example.daggerpizzeria.example_23

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class ShapeViewModel @Inject constructor() : ViewModel() {
    private val selectedShape = MutableLiveData<String>()
    fun selectShape(shape: String) {
        selectedShape.value = shape
    }
    companion object {
        val SHAPES = arrayOf("Круг", "Квадрат", "Сердце")
    }
}
