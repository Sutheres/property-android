package com.prestiqe.property_android.ui.main

import androidx.lifecycle.MutableLiveData
import com.prestiqe.property_android.ui.base.BaseViewModel
import com.prestiqe.property_android.utils.common.Event
import com.prestiqe.property_android.utils.network.NetworkHelper
import com.prestiqe.property_android.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

class MainViewModel(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper
): BaseViewModel(schedulerProvider, compositeDisposable, networkHelper) {

    val homeNavigation = MutableLiveData<Event<Boolean>>()

    override fun onCreate() {
        homeNavigation.postValue(Event(true))
    }

    fun onHomeSelected() {
        homeNavigation.postValue(Event(true))
    }

}