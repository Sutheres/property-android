package com.prestiqe.property_android.di.module

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.prestiqe.property_android.di.ActivityContext
import com.prestiqe.property_android.ui.base.BaseActivity
import com.prestiqe.property_android.ui.main.MainViewModel
import com.prestiqe.property_android.utils.ViewModelProviderFactory
import com.prestiqe.property_android.utils.network.NetworkHelper
import com.prestiqe.property_android.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

@Module
class ActivityModule constructor(private val activity: BaseActivity<*>) {

    @ActivityContext
    @Provides
    fun provideContext(): Context = activity

    @Provides
    fun provideMainViewModel(
        schedulerProvider: SchedulerProvider,
        compositeDisposable: CompositeDisposable,
        networkHelper: NetworkHelper
    ): MainViewModel = ViewModelProviders.of(
        activity, ViewModelProviderFactory(MainViewModel::class) {
        MainViewModel(schedulerProvider, compositeDisposable, networkHelper)
    }).get(MainViewModel::class.java)
}