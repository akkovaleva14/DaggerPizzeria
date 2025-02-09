package com.example.daggerpizzeria.example_17

import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [InfoProvidersModule17::class])
interface InfoSubcomponent17 {
    fun getInfo(): Info

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun setPizzaType(pizzaType: String): Builder
        fun build(): InfoSubcomponent17
    }
}

/*
Субкомпонент для создания Info
Использует модуль InfoProvidersModule17
@BindsInstance позволяет динамически внедрять pizzaType

@BindsInstance - это аннотация в Dagger, которая позволяет
динамически добавлять значения в граф зависимостей во время выполнения программы.

Когда вы используете @BindsInstance, Dagger генерирует код, который:

Принимает значение
Создает провайдер для этого значения
Добавляет его в граф зависимостей
Ограничения

Работает только с билдерами субкомпонентов
Не заменяет полностью модули с @Provides
Лучше подходит для простых значений
 */