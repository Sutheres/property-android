package com.prestiqe.property_android.di.component

import android.app.Application
import android.content.Context
import com.prestiqe.property_android.data.repository.PropertyRepository
import com.prestiqe.property_android.di.ApplicationContext
import com.prestiqe.property_android.di.module.ApplicationModule
import com.prestiqe.property_android.utils.network.NetworkHelper
import com.prestiqe.property_android.utils.rx.SchedulerProvider
import dagger.Component
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun injectApplication(application: Application)

    fun getApplication(): Application

    @ApplicationContext
    fun getContext(): Context

    fun getCompositeDisposable(): CompositeDisposable

    fun getSchedulerProvider(): SchedulerProvider

    fun getNetworkHelper(): NetworkHelper

    fun getPropertyRepository(): PropertyRepository
}