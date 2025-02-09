package com.example.daggerpizzeria.example_18

import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [InfoProvidersModule18::class])
interface InfoSubcomponent18 {
    fun getInfo(): Info

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance pizzaType: String): InfoSubcomponent18
    }
}

/*
Субкомпонент с модулем InfoProvidersModule18
Использует @BindsInstance для динамического внедрения pizzaType
Предоставляет метод getInfo() для получения объекта Info
 */