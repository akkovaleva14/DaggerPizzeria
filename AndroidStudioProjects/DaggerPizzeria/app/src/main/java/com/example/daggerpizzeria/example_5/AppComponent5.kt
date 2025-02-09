package com.example.daggerpizzeria.example_5

import dagger.Component

// Указываем модули, которые будут участвовать в создании графа зависимостей
@Component(modules = [
    PizzaBindingsModule5::class,
    PizzaProvidersModule5::class,
    SauceModule5::class
])
interface AppComponent5 {
    // Метод для инъекции зависимостей в Application
    // Dagger сгенерирует реализацию этого метода
    fun injectIntoApp(app: App5)
}