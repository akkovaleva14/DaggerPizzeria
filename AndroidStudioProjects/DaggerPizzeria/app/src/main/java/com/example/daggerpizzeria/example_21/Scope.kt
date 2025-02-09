package com.example.daggerpizzeria.example_21

import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class OrderScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class UserScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope