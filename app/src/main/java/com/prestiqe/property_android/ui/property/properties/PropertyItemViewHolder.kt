package com.prestiqe.property_android.ui.property.properties

import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.prestiqe.property_android.R
import com.prestiqe.property_android.data.models.Property
import com.prestiqe.property_android.di.component.ViewHolderComponent
import com.prestiqe.property_android.ui.base.BaseItemViewHolder
import kotlinx.android.synthetic.main.property_list_item.view.*


class PropertyItemViewHolder(parent: ViewGroup) :
    BaseItemViewHolder<Property, PropertyItemViewModel>(R.layout.property_list_item, parent) {

    override fun injectDependencies(viewHolderComponent: ViewHolderComponent) = viewHolderComponent.inject(this)

    override fun setupView(view: View) {
        itemView.setOnClickListener {
            viewModel.onItemClick(itemView.context)
        }
    }

    override fun setupObservers() {
        super.setupObservers()

        viewModel.description.observe(this, Observer {
          itemView.description.text = it
        })

        viewModel.image.observe(this, Observer {
            Glide.with(itemView.context).load(it.url).into(itemView.image)
        })

        viewModel.price.observe(this, Observer {
            itemView.price.text = it
        })

        viewModel.address.observe(this, Observer {
            itemView.address.text = it
        })

        viewModel.beds.observe(this, Observer {
            itemView.bedsTv.text = it
        })

        viewModel.baths.observe(this, Observer {
            itemView.bathsTv.text = it
        })

        viewModel.sqFt.observe(this, Observer {
            itemView.squareFeet.text = it
        })
    }

}