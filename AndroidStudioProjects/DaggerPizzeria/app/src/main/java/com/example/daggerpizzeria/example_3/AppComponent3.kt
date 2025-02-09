package com.example.daggerpizzeria.example_3

import dagger.Component

@Component(modules = [PizzaModule3::class, SauceModule3::class])
interface AppComponent3 {
    // Метод для внедрения зависимостей в App3
    fun injectIntoApp(app: App3)
}

/*
@Component создает граф зависимостей
Указывает модули, которые будут использоваться для создания зависимостей
Генерирует реализацию DaggerAppComponent3
 */