package com.example.daggerpizzeria.example_4

import android.app.Application
import android.util.Log
import com.example.daggerpizzeria.models.api.Pizza
import javax.inject.Inject

class App4 : Application() {
    @Inject
    lateinit var lazyPizza: dagger.Lazy<Pizza>
    /*
    @Inject указывает, что lazyPizza должен быть внедрен Dagger
    lateinit позволяет отложить инициализацию
    dagger.Lazy<Pizza> создает "ленивую" зависимость
     */

    private lateinit var appComponent: AppComponent4

    override fun onCreate() {
        super.onCreate()
        // Создание графа зависимостей
        appComponent = DaggerAppComponent4.create()
        Log.d("Aleks", "App4: before Injection pizza is initialized = ${::lazyPizza.isInitialized}")
        /*
        DaggerAppComponent4.create() генерирует компонент
        На этом этапе lazyPizza еще не инициализирован
         */

        appComponent.injectIntoApp(this)
        /*
        injectIntoApp() внедряет зависимости в App4
        Важно: Lazy<Pizza> НЕ создается сразу
        ТОЛЬКО ЗДЕСЬ происходит реальное создание Pizza
        */
        Log.d("Aleks", "App4: after Injection pizza is initialized = ${::lazyPizza.isInitialized}")

        val pizzaA = lazyPizza.get()  // Первый вызов создает объект
        val pizzaB = lazyPizza.get()  // Второй вызов возвращает тот же объект
        /*
        Особенности dagger.Lazy<T>
        Объект создается только при первом вызове .get()
        Последующие вызовы возвращают тот же самый объект
        Работает как синглтон для этого экземпляра
         */
        pizzaA.prepare()
        pizzaA.serve()
        Log.d("Aleks", "App4: pizzaA === pizzaB = ${pizzaA === pizzaB}")
    }
}