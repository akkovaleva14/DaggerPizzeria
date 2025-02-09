package com.example.daggerpizzeria.example_21

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun orderComponent(): OrderComponent.Factory
    fun userComponent(): UserComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): AppComponent
    }
}

@ActivityScope
@OrderScope
@Subcomponent(modules = [OrderModule::class])
interface OrderComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): OrderComponent
    }

    fun uiHelper(): UiHelper
    fun inject(activity: OrderActivity)
}

@ActivityScope
@UserScope
@Subcomponent(modules = [UserModule::class])
interface UserComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    fun uiHelper(): UiHelper
    fun inject(activity: UserActivity)
}