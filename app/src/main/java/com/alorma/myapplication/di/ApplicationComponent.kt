package com.alorma.myapplication.di

import com.alorma.myapplication.di.module.ApplicationModule
import com.alorma.myapplication.di.module.DataModule
import com.alorma.myapplication.di.module.NetModule
import com.alorma.myapplication.ui.detail.DetailComponent
import com.alorma.myapplication.ui.detail.di.DetailModule
import com.alorma.myapplication.ui.shows.di.ShowsComponent
import com.alorma.myapplication.ui.shows.di.ShowsModule
import com.alorma.myapplication.ui.splash.di.SplashComponent
import com.alorma.myapplication.ui.splash.di.SplashModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, NetModule::class, DataModule::class])
interface ApplicationComponent {
    infix fun add(module: SplashModule): SplashComponent
    infix fun add(module: ShowsModule): ShowsComponent
    infix fun add(module: DetailModule): DetailComponent
}