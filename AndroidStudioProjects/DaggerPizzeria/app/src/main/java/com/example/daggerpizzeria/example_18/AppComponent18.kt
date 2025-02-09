package com.example.daggerpizzeria.example_18

import dagger.Component

@Component(modules = [PizzaProvidersModule18::class])
interface AppComponent18 {
    fun getInfoSubcomponentFactory(): InfoSubcomponent18.Factory
}

/*
Корневой компонент dependency graph
Содержит PizzaProvidersModule18
Предоставляет фабрику для создания субкомпонента InfoSubcomponent18
 */