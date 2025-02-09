package com.example.daggerpizzeria.example_8

import com.example.daggerpizzeria.models.api.Sauce
import com.example.daggerpizzeria.models.impl.TomatoSauceImpl
import dagger.Module
import dagger.Provides

@Module
class SauceModule8 {

    @Provides
    fun provideSauce(): Sauce = TomatoSauceImpl()
}
