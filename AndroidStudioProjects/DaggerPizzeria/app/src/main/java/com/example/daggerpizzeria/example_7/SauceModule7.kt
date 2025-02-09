package com.example.daggerpizzeria.example_7

import com.example.daggerpizzeria.models.api.Sauce
import com.example.daggerpizzeria.models.impl.TomatoSauceImpl
import dagger.Module
import dagger.Provides

@Module
class SauceModule7 {

    @Provides
    fun provideSauce(): Sauce = TomatoSauceImpl()
}