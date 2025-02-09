package com.example.daggerpizzeria.example_5

import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity()

/*
@Inject - маркер для инъекции зависимостей
@Named - квалификатор для различения объектов одного типа
@Provides - метод создания сложных зависимостей
@Binds - простая привязка реализации к интерфейсу
@Component - описание графа зависимостей
@Module - контейнер для провайдеров и привязок

Dagger генерирует DaggerAppComponent5
В onCreate() создается компонент
Вызывается injectIntoApp()
Dagger заполняет помеченные @Inject поля
 */