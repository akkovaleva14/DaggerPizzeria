package com.example.daggerpizzeria

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Pepperoni

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Margherita

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Vegetarian

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Hawaiian