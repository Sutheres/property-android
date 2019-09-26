package com.prestiqe.property_android.ui.property.properties

import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import com.prestiqe.property_android.data.models.Property
import com.prestiqe.property_android.ui.base.BaseAdapter

class PropertyAdapter(
    parentLifecycle: Lifecycle,
    properties: ArrayList<Property>
): BaseAdapter<Property, PropertyItemViewHolder>(parentLifecycle, properties) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PropertyItemViewHolder(parent)

}