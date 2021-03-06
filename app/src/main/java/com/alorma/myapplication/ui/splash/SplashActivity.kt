package com.alorma.myapplication.ui.splash

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alorma.myapplication.TrendingTvApp.Companion.component
import com.alorma.myapplication.ui.common.BaseView
import com.alorma.myapplication.ui.common.State
import com.alorma.myapplication.ui.splash.di.SplashModule
import javax.inject.Inject

class SplashActivity : AppCompatActivity(), BaseView<State> {
    @Inject
    lateinit var actions: SplashActions

    @Inject
    lateinit var presenter: SplashPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        component add SplashModule(this) inject this

        presenter init this
        presenter reduce actions.load()
    }

    override fun render(state: State) {

    }
}
