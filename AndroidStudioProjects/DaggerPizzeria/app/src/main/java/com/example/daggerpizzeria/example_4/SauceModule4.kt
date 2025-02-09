package com.example.daggerpizzeria.example_4

import com.example.daggerpizzeria.models.api.Sauce
import com.example.daggerpizzeria.models.impl.TomatoSauceImpl
import dagger.Module
import dagger.Provides

@Module
class SauceModule4 {
    @Provides
    fun provideTomatoSauce(): Sauce = TomatoSauceImpl()
}
// Описывает, как создавать Sauce