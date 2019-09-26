package com.prestiqe.property_android.di.component

import androidx.lifecycle.LifecycleRegistry
import com.prestiqe.property_android.di.ViewModelScope
import com.prestiqe.property_android.di.module.ViewHolderModule
import com.prestiqe.property_android.ui.property.properties.PropertyItemViewHolder
import dagger.Component


@ViewModelScope
@Component(dependencies = [ApplicationComponent::class], modules = [ViewHolderModule::class])
interface ViewHolderComponent {

    fun getLifecycleRegistry(): LifecycleRegistry

    fun inject(propertyItemViewHolder: PropertyItemViewHolder)

 }