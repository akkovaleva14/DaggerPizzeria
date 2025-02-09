package com.example.daggerpizzeria.example_20

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerpizzeria.R

class MainActivity20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.root, FirstFragment())
                .commit()
        }
    }
}

/*
Ключевые Моменты Работы

Создание Компонентов

В App20.onCreate() создается AppComponent
Сразу же создается OrderComponent через фабрику

Внедрение Зависимостей

PizzaOrderRepository создается один раз в AppModule
Помечен @AppScope, что гарантирует синглтон
Живет все время работы приложения

Поток Данных

В FirstFragment добавляется заказ
В OrderFragment показываются все заказы
Репозиторий остается единым для обоих фрагментов
 */