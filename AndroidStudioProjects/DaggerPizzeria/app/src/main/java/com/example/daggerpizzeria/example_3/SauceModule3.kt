package com.example.daggerpizzeria.example_3

import com.example.daggerpizzeria.models.api.Sauce
import com.example.daggerpizzeria.models.impl.TomatoSauceImpl
import dagger.Module
import dagger.Provides

@Module
class SauceModule3 {
    // Провайдер создает экземпляр Sauce
    @Provides
    fun provideTomatoSauce(): Sauce = TomatoSauceImpl()
}