package com.prestiqe.property_android.ui.property_details

import com.prestiqe.property_android.ui.base.BaseViewModel
import com.prestiqe.property_android.utils.network.NetworkHelper
import com.prestiqe.property_android.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

class PropertyDetailsViewModel(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper
): BaseViewModel(schedulerProvider, compositeDisposable, networkHelper) {

    override fun onCreate() {}

}