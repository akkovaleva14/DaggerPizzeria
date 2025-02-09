package com.example.daggerpizzeria.example_3

import android.app.Application
import com.example.daggerpizzeria.models.api.Pizza
import javax.inject.Inject

class App3 : Application() {
    @Inject
    lateinit var pizza: Pizza  // Аннотация @Inject указывает, что зависимость должна быть внедрена Dagger

    lateinit var appComponent: AppComponent3

    override fun onCreate() {
        super.onCreate()
        // Создание компонента Dagger
        appComponent = DaggerAppComponent3.create()
        // Внедрение зависимостей в текущий класс
        appComponent.injectIntoApp(this)

        // Использование внедренной зависимости
        pizza.prepare()
        pizza.serve()
    }
}
