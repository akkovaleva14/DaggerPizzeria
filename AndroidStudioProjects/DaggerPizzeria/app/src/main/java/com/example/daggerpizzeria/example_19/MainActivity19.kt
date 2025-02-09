package com.example.daggerpizzeria.example_19

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpizzeria.R

// 8. Главная Activity
class MainActivity19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.root, FirstFragment19())
                .commit()
        }
    }
}