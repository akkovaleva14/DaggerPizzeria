package com.example.daggerpizzeria.example_21

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun provideContext(application: Application): Context = application.applicationContext
}

@Module
class OrderModule {
    @OrderScope
    @Provides
    fun provideOrderUiHelper(context: Context): UiHelper {
        return UiHelper(context)
    }
}

@Module
class UserModule {
    @UserScope
    @Provides
    fun provideUserUiHelper(context: Context): UiHelper {
        return UiHelper(context)
    }
}