package com.example.daggerpizzeria.example_21

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject


class UserActivity : AppCompatActivity() {
    private lateinit var userUiHelper: UiHelper
    private lateinit var userComponent: UserComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        val appComponent = (application as App21).appComponent
        userComponent = appComponent
            .userComponent()
            .create()
            .also { it.inject(this) }
        userUiHelper = userComponent.uiHelper()

        super.onCreate(savedInstanceState)

        userUiHelper.showToast("User Activity Created!")
        Log.d("Aleks", "UserActivity onCreate, UiHelper: $userUiHelper")
    }
}

// Also OK
//class UserActivity @Inject constructor() : AppCompatActivity() {
//    private lateinit var userUiHelper: UiHelper
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        val userComponent = (application as App21)
//            .appComponent
//            .userComponent()
//            .create()
//        userComponent.inject(this)
//        userUiHelper = userComponent.uiHelper()
//
//        super.onCreate(savedInstanceState)
//
//        userUiHelper.showToast("User Activity created!")
//        Log.d("Aleks", "UserActivity onCreate, UiHelper: $userUiHelper")
//    }
//}