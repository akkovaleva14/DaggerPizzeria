package com.example.daggerpizzeria.example_10

import androidx.appcompat.app.AppCompatActivity

class MainActivity10 : AppCompatActivity()

/*
Процесс работы следующий:

Объект Chef передается в конструктор модуля при создании компонента
Метод providePizzaChef() возвращает этот же объект Chef
Метод provideSpicyPizza() использует этого Chef при создании Pizza
Преимущества такого подхода:

Гибкость: Можно передавать предварительно сконфигурированные объекты
Контроль: Явное управление зависимостями
Тестируемость: Легко подменять зависимости
 */