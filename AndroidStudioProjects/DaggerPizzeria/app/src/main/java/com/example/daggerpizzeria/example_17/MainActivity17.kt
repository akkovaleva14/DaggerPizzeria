package com.example.daggerpizzeria.example_17

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpizzeria.R

class MainActivity17 : AppCompatActivity(), FirstFragmentContract {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Добавим явный вызов фрагмента
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.root, FirstFragment17())
                .commit()
        }
    }

    override fun onButtonSendDataClicked(data: String) {
        val app = (application as App17)

        // Инициализируем субкомпонент
        if (!app.isInfoSubcomponentInitialized()) {
            app.infoSubcomponent = app.appComponent
                .getInfoSubcomponentBuilder()
                .setPizzaType(data)
                .build()
        }

        // Заменим фрагмент
        supportFragmentManager.beginTransaction()
            .replace(R.id.root, SecondFragment17())
            .addToBackStack(null) // Добавим возможность возврата назад
            .commit()
    }
}
