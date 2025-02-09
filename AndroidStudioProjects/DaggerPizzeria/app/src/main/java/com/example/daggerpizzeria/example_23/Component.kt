package com.example.daggerpizzeria.example_23

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun pizzaComponent(): PizzaComponent.Factory
}

@ActivityScope
@Subcomponent(modules = [
    ActivityModule::class,
    ViewModelModule::class
])
interface PizzaComponent {
    fun inject(activity: MainActivity23)
    fun inject(fragment: PizzaDetailFragment)

    fun provideViewModelFactory(): ViewModelProvider.Factory

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance activity: AppCompatActivity): PizzaComponent
    }
}


