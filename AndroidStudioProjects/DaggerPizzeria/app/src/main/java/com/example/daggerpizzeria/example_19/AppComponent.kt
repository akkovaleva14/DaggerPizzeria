package com.example.daggerpizzeria.example_19

import dagger.Component

// 5. Главный компонент приложения
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getOrderComponentFactory(): OrderComponent.Factory
}

/*
Корневой компонент приложения
Содержит модуль AppModule
Предоставляет фабрику для создания OrderComponent
 */