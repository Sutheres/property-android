package com.prestiqe.property_android.di.component

import com.prestiqe.property_android.di.FragmentScope
import com.prestiqe.property_android.di.module.FragmentModule
import com.prestiqe.property_android.ui.property.PropertyFragment
import dagger.Component

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {

    fun inject(propertyFragment: PropertyFragment)
}