package com.prestiqe.property_android.di.module

import android.content.Context
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.prestiqe.property_android.di.FragmentContext
import com.prestiqe.property_android.di.FragmentScope
import com.prestiqe.property_android.ui.base.BaseFragment
import com.prestiqe.property_android.ui.properties.PropertyViewModel
import com.prestiqe.property_android.utils.ViewModelProviderFactory
import com.prestiqe.property_android.utils.network.NetworkHelper
import com.prestiqe.property_android.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

@Module
class FragmentModule constructor(private val fragment: BaseFragment<*>) {

    @FragmentContext
    @Provides
    fun provideContext(): Context = fragment.context!!

    @Provides
    fun provideLinearLayoutManager() = LinearLayoutManager(fragment.context)

    @Provides
    fun provideMainViewModel(
        schedulerProvider: SchedulerProvider,
        compositeDisposable: CompositeDisposable,
        networkHelper: NetworkHelper
    ): PropertyViewModel = ViewModelProviders.of(
        fragment.activity!!, ViewModelProviderFactory(PropertyViewModel::class) {
            PropertyViewModel(schedulerProvider, compositeDisposable, networkHelper)
        }).get(PropertyViewModel::class.java)
}