package com.prestiqe.property_android.ui.property.properties

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.prestiqe.property_android.data.models.Image
import com.prestiqe.property_android.data.models.Property
import com.prestiqe.property_android.ui.base.BaseItemViewModel
import com.prestiqe.property_android.utils.common.Event
import com.prestiqe.property_android.utils.common.Toaster
import com.prestiqe.property_android.utils.network.NetworkHelper
import com.prestiqe.property_android.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class PropertyItemViewModel @Inject constructor(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper
): BaseItemViewModel<Property>(schedulerProvider, compositeDisposable, networkHelper) {

    companion object {
        const val TAG = "PropertyItemViewModel"
    }

    val description: LiveData<String> = Transformations.map(data) { it.description }
    val image: LiveData<Image> = Transformations.map(data) { it.images[0] }
    val price: LiveData<String> = Transformations.map(data) { it.price }
    val address: LiveData<String> = Transformations.map(data) { "${it.streetNumber} ${it.street} ${it.streetSuffix}, ${it.city}, ${it.state}"}
    val beds: LiveData<String> = Transformations.map(data) { "${it.bedrooms} beds" }
    val baths: LiveData<String> = Transformations.map(data) { "${it.bathrooms} baths" }
    val sqFt: LiveData<String> = Transformations.map(data) { "${it.squareFeet} SqFt" }

    val propertyDetailsNavigation = MutableLiveData<Event<Boolean>>()

    override fun onCreate() {}

    fun onItemClick() {
        propertyDetailsNavigation.postValue(Event(true))
    }

}