package com.example.daggerpizzeria.example_16

import dagger.Component

@Component(modules = [PizzaProvidersModule16::class])
interface AppComponent16 {
    /**
     * Этим методом мы связали subcomponent с его родителем
     * так subcomponent получает ссылки на все модули его родителя (AppComponent16)
     *
     * Передаем модуль InfoProvidersModule
     */
    fun getInfoSubcomponent(infoProvidersModule: InfoProvidersModule16): InfoSubcomponent16
}

/*
Определяет основной граф зависимостей
Содержит модуль PizzaProvidersModule16
Предоставляет метод для создания субкомпонента
 */