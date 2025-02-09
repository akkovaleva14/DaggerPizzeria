package com.example.daggerpizzeria.example_15

import androidx.appcompat.app.AppCompatActivity

class MainActivity15 : AppCompatActivity()

/*
Ключевые особенности примера:

Subcomponent (Подкомпонент):
InfoSubcomponent15 создается через родительский AppComponent15
Подкомпонент наследует все зависимости родительского компонента
Используется для создания более сложных графов зависимостей

Модули:
PizzaProvidersModule15: Предоставляет базовую реализацию пиццы
InfoProvidersModule15: Создает Info на основе типа пиццы

Внедрение зависимостей:
Демонстрирует, как один компонент может предоставлять зависимости другому
Показывает гибкость Dagger в создании графов зависимостей
 */