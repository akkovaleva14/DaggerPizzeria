package com.example.daggerpizzeria.example_19

import android.app.Application
import dagger.Module
import dagger.Provides

// 6. Модуль приложения
@Module
class AppModule {
    @Provides
    fun provideApplication(application: Application): Application = application
}

/*
Предоставляет базовые зависимости уровня приложения
В данном случае просто возвращает Application
 */