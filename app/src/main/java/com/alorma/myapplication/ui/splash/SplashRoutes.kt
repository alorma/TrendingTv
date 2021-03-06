package com.alorma.myapplication.ui.splash

import com.alorma.myapplication.ui.common.Route
import javax.inject.Inject

class SplashRoutes @Inject constructor() {
    sealed class SplashRoute : Route() {
        object Main : SplashRoute()
        object Error : SplashRoute()
    }

    fun main(): SplashRoute = SplashRoute.Main
    fun error(): SplashRoute = SplashRoute.Error
}