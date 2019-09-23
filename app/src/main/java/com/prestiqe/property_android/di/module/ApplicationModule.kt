package com.prestiqe.property_android.di.module

import android.app.Application
import android.content.Context
import com.prestiqe.property_android.PropertyApplication
import com.prestiqe.property_android.di.ApplicationContext
import com.prestiqe.property_android.utils.network.NetworkHelper
import com.prestiqe.property_android.utils.rx.RxSchedulerProvider
import com.prestiqe.property_android.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
class ApplicationModule constructor(private val application: PropertyApplication) {

    @Provides
    @Singleton
    fun provideApplication(): Application = application

    @Provides
    @Singleton
    @ApplicationContext
    fun provideContext(): Context = application

    @Provides
    fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()

    @Provides
    fun provideSchedulerProvider(): SchedulerProvider = RxSchedulerProvider()

    @Provides
    fun provideNetworkHelper(): NetworkHelper = NetworkHelper(application)
}