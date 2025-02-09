package com.example.daggerpizzeria.example_6

import androidx.appcompat.app.AppCompatActivity

class MainActivity6 : AppCompatActivity()

/*
Последовательность создания зависимостей:
Sauce создается первым
Vegetarian Pizza получает Sauce как параметр
Другие пиццы создаются независимо
Типы создания зависимостей:
@Provides: Явное создание (Pepperoni, Margherita)
@Binds: Привязка реализации (Hawaiian)
Внедрение зависимостей (Vegetarian с sauce)
Квалификаторы:
@Pepperoni, @Margherita и т.д. помогают Dagger различать реализации

Пошаговый процесс

Android создает App6
Вызывается onCreate()
Создается DaggerAppComponent6
Внедряются зависимости для помеченных полей
Выполняется логирование
 */