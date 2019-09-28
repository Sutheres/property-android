package com.prestiqe.property_android.ui.property

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.prestiqe.property_android.R
import com.prestiqe.property_android.data.models.Image
import com.prestiqe.property_android.data.models.Property
import com.prestiqe.property_android.di.component.FragmentComponent
import com.prestiqe.property_android.ui.base.BaseFragment
import com.prestiqe.property_android.ui.property.properties.PropertyAdapter
import kotlinx.android.synthetic.main.fragment_property.*
import javax.inject.Inject

class PropertyFragment : BaseFragment<PropertyViewModel>() {

    @Inject
    lateinit var linearLayoutManager: LinearLayoutManager

    @Inject
    lateinit var adapter: PropertyAdapter

    override fun provideLayoutID(): Int = R.layout.fragment_property

    override fun injectDependencies(fragmentComponent: FragmentComponent) = fragmentComponent.inject(this)

    override fun setupView(view: View) {

        properties_rv.setHasFixedSize(true)
        properties_rv.layoutManager = linearLayoutManager
        properties_rv.adapter = adapter

    }

    override fun setupObservers() {
        super.setupObservers()

        viewModel.properties.observe(this, Observer {
            it?.let {
                adapter.updateData(it)
            }
        })
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