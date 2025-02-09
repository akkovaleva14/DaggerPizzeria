package com.example.daggerpizzeria.example_20

import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

/*
В example_19 синглтон ограничен компонентом,
а в example_20 синглтон живет все время работы приложения.

Scope и Время Жизни

Example 19:
Использовал @OrderScope
Синглтон ограничен жизненным циклом OrderComponent
Каждый раз при открытии экрана создается новый репозиторий
[По логам - один и тот же репозиторий!!11]

Example 20:
Использует @AppScope
Синглтон живет все время работы приложения
Один и тот же репозиторий используется во всех компонентах

Модули

Example 19:
Полный OrderModule с созданием репозитория
Scope привязан к модулю и компоненту

Example 20:
Минималистичный OrderModule
Создание репозитория перенесено в AppModule
Scope определен на уровне приложения

Внедрение Зависимостей

Example 19:
Базовое внедрение через конструктор
Простые методы

Example 20:
Внедрение через @Inject
Метод inject() в компоненте
Более сложная структура внедрения
 */