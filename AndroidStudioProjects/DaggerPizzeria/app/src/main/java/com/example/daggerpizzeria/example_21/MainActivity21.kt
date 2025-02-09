package com.example.daggerpizzeria.example_21

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpizzeria.R

class MainActivity21 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main21)

        val orderButton: Button = findViewById(R.id.btnOpenOrderActivity)
        val userButton: Button = findViewById(R.id.btnOpenUserActivity)

        orderButton.setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
        }

        userButton.setOnClickListener {
            startActivity(Intent(this, UserActivity::class.java))
        }
    }

}
