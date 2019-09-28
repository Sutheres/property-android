package com.prestiqe.property_android.di.component

import com.prestiqe.property_android.di.ActivityScope
import com.prestiqe.property_android.di.module.ActivityModule
import com.prestiqe.property_android.ui.property_details.PropertyDetailsActivity
import com.prestiqe.property_android.ui.main.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(propertyDetailsActivity: PropertyDetailsActivity)
}