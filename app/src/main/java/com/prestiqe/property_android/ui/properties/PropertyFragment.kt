package com.prestiqe.property_android.ui.properties

import android.os.Bundle
import android.view.View
import com.prestiqe.property_android.R
import com.prestiqe.property_android.di.component.FragmentComponent
import com.prestiqe.property_android.ui.base.BaseFragment

class PropertyFragment : BaseFragment<PropertyViewModel>() {

    override fun provideLayoutID(): Int = R.layout.fragment_property

    override fun injectDependencies(fragmentComponent: FragmentComponent) = fragmentComponent.inject(this)

    override fun setupView(view: View) {

    }

    companion object {

        fun newInstance(): PropertyFragment {
            val args = Bundle()
            val fragment = PropertyFragment()
            fragment.arguments = args
            return fragment
        }

        const val TAG = "PropertyFragment"
    }
}