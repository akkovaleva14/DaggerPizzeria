package com.example.daggerpizzeria.example_18

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpizzeria.R

class MainActivity18 : AppCompatActivity(), FirstFragmentContract {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.root, FirstFragment18())
                .commit()
        }
    }

    override fun onButtonSendDataClicked(data: String) {
        val app = (application as App18)

        if (!app.isInfoSubcomponentInitialized()) {
            app.infoSubcomponent = app.appComponent
                .getInfoSubcomponentFactory()
                .create(data)
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.root, SecondFragment18())
            .addToBackStack(null)
            .commit()
    }
}