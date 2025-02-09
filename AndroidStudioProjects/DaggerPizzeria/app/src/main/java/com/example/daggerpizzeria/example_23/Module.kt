package com.example.daggerpizzeria.example_23

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import dagger.Provides
import javax.inject.Singleton
import dagger.multibindings.IntoMap

@Module
class AppModule(private val context: Context) {
    @Provides
    @Singleton
    fun provideContext(): Context = context
}

@Module
class ActivityModule {
    @Provides
    @ActivityScope
    fun provideViewModelFactory(pizzaViewModelFactory: PizzaViewModelFactory)
            : ViewModelProvider.Factory = pizzaViewModelFactory

    @Provides
    @IntoMap
    @ViewModelKey(CustomPizzaViewModel::class)
    fun provideCustomPizzaViewModel(factory: CustomPizzaViewModelFactory): ViewModel {
        // Создаем ViewModel с дефолтными параметрами
        return factory.create("Маргарита", 35)
    }

    @Provides
    @ActivityScope
    fun providePizzaIngredients(): PizzaIngredients = PizzaIngredients()
}

@Module
interface ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(StandardPizzaViewModel::class)
    fun bindStandardPizzaViewModel(viewModel: StandardPizzaViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ShapeViewModel::class)
    fun bindShapeViewModel(viewModel: ShapeViewModel): ViewModel
}


