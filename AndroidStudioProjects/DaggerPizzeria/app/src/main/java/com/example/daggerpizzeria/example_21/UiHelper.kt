package com.example.daggerpizzeria.example_21

import android.content.Context
import android.util.Log
import android.widget.Toast
import javax.inject.Inject

class UiHelper @Inject constructor(
    private val context: Context
) {
    private val tag = "Aleks"

    init {
        Log.d(tag, "UiHelper created: ${hashCode()}")
    }

    fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    override fun toString(): String {
        return "UiHelper@${hashCode()}"
    }

    protected fun finalize() {
        Log.d(tag, "UiHelper destroyed: ${hashCode()}")
    }
}
