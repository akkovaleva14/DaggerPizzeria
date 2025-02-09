package com.example.daggerpizzeria.example_3

import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity()

/*
Процесс внедрения зависимостей:

Создание графа зависимостей:
Dagger анализирует аннотации @Component, @Module, @Provides
Генерирует код для создания и связывания зависимостей
Внедрение зависимостей:
DaggerAppComponent3.create() создает компонент
appComponent.injectIntoApp(this) внедряет зависимости в App3
Разрешение зависимостей:
Dagger видит, что Pizza зависит от Sauce
Находит провайдер provideTomatoSauce() в SauceModule3
Создает TomatoSauceImpl
Передает его в providePepperoniPizzaWithSauce()
Создает PepperoniPizzaImpl с sauce
Ключевые особенности:

Неявное создание зависимостей: Dagger автоматически создает и связывает объекты
Инверсия управления (IoC): Класс не создает зависимости самостоятельно
Декларативность: Зависимости описываются через аннотации
 */