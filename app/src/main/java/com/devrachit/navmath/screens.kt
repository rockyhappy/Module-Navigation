package com.devrachit.navmath

sealed class AppScreens(val route: String) {
    object Screen1 : AppScreens("screen_1")
    object Screen2 : AppScreens("screen_2")
    object Screen3 : AppScreens("screen_3")
}