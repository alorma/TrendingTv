package com.alorma.myapplication.ui.detail

import com.alorma.myapplication.ui.common.Route
import javax.inject.Inject

class DetailRoutes @Inject constructor() {
    sealed class DetailRoute : Route() {
        object Back : DetailRoute()
    }

    fun back(): DetailRoute = DetailRoute.Back
}