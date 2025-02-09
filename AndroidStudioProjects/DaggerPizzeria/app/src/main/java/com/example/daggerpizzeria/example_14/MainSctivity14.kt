package com.example.daggerpizzeria.example_14

import androidx.appcompat.app.AppCompatActivity

class MainSctivity14 : AppCompatActivity()

/*
Ключевое различие с предыдущими примерами:

В Example_14 используется @Component.Factory, который:

Предоставляет более декларативный способ создания компонента
Позволяет внедрять зависимости напрямую при создании компонента
Упрощает процесс создания и настройки компонента

Сравнение с Example_13:

Example_13: Использует @Component.Builder с методом setTaxiDriverToComponent()
Example_14: Использует @Component.Factory с методом create()

Преимущества @Component.Factory:

Более чистый и лаконичный синтаксис
Явное указание зависимостей при создании компонента
Улучшенная читаемость кода
Простота внедрения зависимостей
 */