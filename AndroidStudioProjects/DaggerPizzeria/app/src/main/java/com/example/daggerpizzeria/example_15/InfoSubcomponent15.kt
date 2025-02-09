package com.example.daggerpizzeria.example_15

import dagger.Subcomponent

@Subcomponent(modules = [InfoProvidersModule15::class])
interface InfoSubcomponent15 {
    fun getInfo(): Info
}
