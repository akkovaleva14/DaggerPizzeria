package com.example.daggerpizzeria.example_16

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpizzeria.R

class MainActivity16 : AppCompatActivity(), FirstFragmentContract {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.root, FirstFragment16())
                .commit()
        }
    }

    override fun onButtonSendDataClicked(data: String) {
        val app = (application as App16)
        if (!app.isInfoSubcomponentInitialized()) {
            val infoProvidersModule = InfoProvidersModule16(data)
            app.infoSubcomponent = app.appComponent.getInfoSubcomponent(infoProvidersModule)
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.root, SecondFragment16())
            .commit()
    }
}

/*
Реализует логику создания субкомпонента при клике на кнопку
Передает введенный пользователем тип пиццы в субкомпонент
 */