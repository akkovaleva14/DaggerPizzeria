package com.example.daggerpizzeria.example_16

import dagger.Subcomponent

@Subcomponent(modules = [InfoProvidersModule16::class])
interface InfoSubcomponent16 {
    fun getInfo(): Info
}
/*
Создается с модулем InfoProvidersModule16
Предоставляет метод для получения объекта Info
 */