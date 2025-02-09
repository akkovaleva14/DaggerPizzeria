package com.example.daggerpizzeria.example_5

import android.app.Application
import android.util.Log
import com.example.daggerpizzeria.models.api.Pizza
import javax.inject.Inject
import javax.inject.Named

// App5 (Точка входа для инъекции зависимостей)
class App5 : Application() {

    // @Inject говорит Dagger, что эти поля нужно заинжектить
    // @Named используется для различения объектов одного типа
    @Named("Pepperoni")
    @Inject
    lateinit var pepperoniPizza: Pizza

    @Named("Margherita")
    @Inject
    lateinit var margheritaPizza: Pizza

    @Named("Vegetarian")
    @Inject
    lateinit var vegetarianPizza: Pizza

    @Named("Hawaiian")
    @Inject
    lateinit var hawaiianPizza: Pizza

    lateinit var appComponent: AppComponent5

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent5.create()

        // Инъекция зависимостей в текущий класс Application
        appComponent.injectIntoApp(this)

        // Логирование внедренных зависимостей
        Log.d(
            "Aleks", "App5. Pizzeria Menu:\n" +
                    "Pepperoni Pizza: ${pepperoniPizza.javaClass.simpleName}\n" +
                    "Margherita Pizza: ${margheritaPizza.javaClass.simpleName}\n" +
                    "Vegetarian Pizza: ${vegetarianPizza.javaClass.simpleName}\n" +
                    "Hawaiian Pizza: ${hawaiianPizza.javaClass.simpleName}"
        )
    }
}