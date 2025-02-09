package com.example.daggerpizzeria.models.api

interface Pizza {
    fun prepare()
    fun serve()
}

/* Интерфейс зависимости
Это абстракция, которую будет внедрять Dagger
Представляет контракт для любой пиццы
 */