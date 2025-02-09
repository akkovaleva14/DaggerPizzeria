package com.example.daggerpizzeria.example_17

import dagger.Component

@Component(modules = [PizzaProvidersModule17::class])
interface AppComponent17 {
    // Метод для создания субкомпонента
    fun getInfoSubcomponentBuilder(): InfoSubcomponent17.Builder

    // Методы для инъекции (если потребуются)
    fun inject(activity: MainActivity17)
    fun inject(fragment: FirstFragment17)
    fun inject(fragment: SecondFragment17)
}

/*
Аннотация @Component определяет корневой компонент внедрения зависимостей
Использует модуль PizzaProvidersModule17
Предоставляет методы для:
Создания субкомпонента
Инъекции зависимостей в классы
 */