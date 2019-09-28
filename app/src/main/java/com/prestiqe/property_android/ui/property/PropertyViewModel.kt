package com.prestiqe.property_android.ui.property

import com.prestiqe.property_android.data.repository.PropertyRepository
import com.prestiqe.property_android.ui.base.BaseViewModel
import com.prestiqe.property_android.utils.network.NetworkHelper
import com.prestiqe.property_android.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

class PropertyViewModel(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper,
    private val propertyRepository: PropertyRepository
): BaseViewModel(schedulerProvider, compositeDisposable, networkHelper) {


    val properties = propertyRepository.propertiesLiveData

    override fun onCreate() {

        getProperties()
    }

    private fun getProperties() = propertyRepository.getProperties()


}