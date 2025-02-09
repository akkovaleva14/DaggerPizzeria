package com.example.daggerpizzeria.example_2

import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity()

/*
Жизненный цикл:
1. Создание компонента: DaggerAppComponent2.create()
2. Проверка состояния до инъекции
3. Внедрение зависимостей: appComponent.injectIntoApp(this)
4. Проверка состояния после инъекции
5. Использование зависимости

Что происходит during compilation:
Dagger генерирует DaggerAppComponent2
Создает механизм внедрения зависимостей
Генерирует код для создания и внедрения Pizza
 */