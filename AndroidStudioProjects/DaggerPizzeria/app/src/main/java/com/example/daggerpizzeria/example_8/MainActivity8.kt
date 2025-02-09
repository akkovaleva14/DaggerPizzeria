package com.example.daggerpizzeria.example_8

import androidx.appcompat.app.AppCompatActivity

class MainActivity8 : AppCompatActivity()

/*
Основное отличие от Example_7 - использование Map вместо Set

Мультибиндинг с ключами
Каждая пицца имеет строковый ключ
Можно получить пиццу по конкретному ключу
Аннотации:
@IntoMap вместо @IntoSet
@StringKey("key_...") для определения ключа

Когда использовать

Когда нужен именованный доступ к объектам
При необходимости группировки с уникальными ключами
В сложных системах с динамической конфигурацией
 */