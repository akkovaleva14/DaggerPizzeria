package com.example.daggerpizzeria.example_1

import com.example.daggerpizzeria.models.impl.MargheritaPizzaImpl
import com.example.daggerpizzeria.models.api.Pizza
import dagger.Module
import dagger.Provides

@Module
class PizzaModule1 {
    @Provides
    fun provideMargherita(): Pizza = MargheritaPizzaImpl()
}

/* Модуль
Аннотация @Module говорит Dagger, что этот класс содержит инструкции по созданию зависимостей
Метод provideMargherita() с аннотацией @Provides указывает, как создавать объект Pizza
Всегда возвращает новый экземпляр MargheritaPizzaImpl()
 */