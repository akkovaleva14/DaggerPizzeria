package com.example.daggerpizzeria.example_5

import com.example.daggerpizzeria.models.api.Sauce
import com.example.daggerpizzeria.models.impl.TomatoSauceImpl
import dagger.Module
import dagger.Provides

@Module
class SauceModule5 {

    // Простой провайдер для создания соуса
    @Provides
    fun provideSauce(): Sauce = TomatoSauceImpl()
}