package com.example.daggerpizzeria.example_2

import dagger.Component

@Component(modules = [PizzaModule2::class])
interface AppComponent2 {
    // Метод для внедрения зависимостей в Application
    fun injectIntoApp(app: App2)
}

/*
Метод injectIntoApp():
Специальный метод в компоненте для внедрения зависимостей в Application
Во время компиляции Dagger сгенерирует код, который найдет все поля с @Inject и заполнит их
 */