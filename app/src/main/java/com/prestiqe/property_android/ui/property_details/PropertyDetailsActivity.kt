package com.prestiqe.property_android.ui.property_details

import android.os.Bundle
import com.prestiqe.property_android.R
import com.prestiqe.property_android.di.component.ActivityComponent
import com.prestiqe.property_android.ui.base.BaseActivity

class PropertyDetailsActivity: BaseActivity<PropertyDetailsViewModel>() {

    override fun provideLayoutID(): Int = R.layout.activity_property_details

    override fun injectDependencies(activityComponent: ActivityComponent) = activityComponent.inject(this)

    override fun setupView(savedInstanceState: Bundle?) {

    }
}