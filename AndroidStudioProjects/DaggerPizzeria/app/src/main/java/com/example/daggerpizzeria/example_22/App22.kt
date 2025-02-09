package com.example.daggerpizzeria.example_22

class App22 : android.app.Application() {
    lateinit var pizzaComponent: PizzaComponent

    override fun onCreate() {
        super.onCreate()
        pizzaComponent = DaggerPizzaComponent.create()
    }
}

/*
🔍 Assisted Injection: Общая концепция

Проблема, которую решает Assisted Injection

Представьте ситуацию:

Часть зависимостей известна во время компиляции (внедряется Dagger)
Часть зависимостей известна только во время выполнения программы
Пример:

Зависимость: UserRepository (внедряется Dagger)
Runtime-параметр: userId (передается при создании)

🧩 Механизм Assisted Injection

@AssistedInject
Помечает конструктор класса
Указывает, какие зависимости внедряются Dagger
Какие параметры передаются вручную

@Assisted
Маркирует параметры, которые будут переданы вручную
Говорит Dagger: "Этот параметр не внедряй"

@AssistedFactory
Генерирует фабрику для создания объектов
Позволяет создавать объекты с runtime-параметрами
 */