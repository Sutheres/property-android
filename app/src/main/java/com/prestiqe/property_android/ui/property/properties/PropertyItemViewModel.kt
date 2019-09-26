package com.prestiqe.property_android.ui.property.properties

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.prestiqe.property_android.data.models.Image
import com.prestiqe.property_android.data.models.Property
import com.prestiqe.property_android.ui.base.BaseItemViewModel
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

    override fun onCreate() {}

    fun onItemClick(context: Context) {
        Toaster.show(context, description.value!!)
    }

}