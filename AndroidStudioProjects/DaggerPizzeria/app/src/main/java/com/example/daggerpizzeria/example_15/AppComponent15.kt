package com.example.daggerpizzeria.example_15

import dagger.Component

@Component(modules = [PizzaProvidersModule15::class])
interface AppComponent15 {
    /**
     * Этим методом мы связали subcomponent с его родителем
     * так subcomponent получает ссылки на все модули его родителя (AppComponent15)
     */
    fun getInfoSubcomponent(): InfoSubcomponent15
}
