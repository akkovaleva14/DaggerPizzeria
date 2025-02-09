package com.example.daggerpizzeria.example_1

import com.example.daggerpizzeria.models.api.Pizza
import dagger.Component

@Component(modules = [PizzaModule1::class])
interface AppComponent1 {
    fun getMargherita(): Pizza
}

/* Компонент
Аннотация @Component создает "фабрику" зависимостей
Указывает на модуль PizzaModule1
Метод getMargherita() позволяет получить экземпляр Pizza
Во время компиляции Dagger сгенерирует реализацию этого интерфейса (DaggerAppComponent1)
 */