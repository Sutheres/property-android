package com.prestiqe.property_android.ui.property

import android.os.Bundle
import android.view.View
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

        val properties = ArrayList<Property>()
        val images = ArrayList<Image>()

        images.add(Image("image", "https://isvr.acceleragent.com/usr/1549750369/CustomPages/images/3.jpg"))

        properties.add(
            Property("1", "2933", "Montana", "Ave",
            "Cincinnati", "OH", "45211", 4.5, 2.5,
                "$40,000", "2,500",
            "2 family in westwood", "Prospect", "my last apartment",
                images, "residential", "multi-family"
            )
        )

        properties.add(
            Property("1", "1000", "South Grand", "Ave",
                "Los Angeles", "CA", "90015", 75.toDouble(), 60.toDouble(),
                "$75,540,000", "20,500",
                "1000 Grand by 711", "Prospect", "nice building looks like a hotel",
                images, "commercial", "apartment building"
            )
        )

        properties.add(
            Property("1", "2933", "Montana", "Ave",
                "Cincinnati", "OH", "45211", 4.5, 2.5,
                "$40,000", "2,500",
                "2 family in westwood", "Prospect", "my last apartment",
                images, "residential", "multi-family"
            )
        )

        properties.add(
            Property("1", "2933", "Montana", "Ave",
                "Cincinnati", "OH", "45211", 4.5, 2.5,
                "$40,000", "2,500",
                "2 family in westwood", "Prospect", "my last apartment",
                images, "residential", "multi-family"
            )
        )

        properties.add(
            Property("1", "2933", "Montana", "Ave",
                "Cincinnati", "OH", "45211", 4.5, 2.5,
                "$40,000", "2,500",
                "2 family in westwood", "Prospect", "my last apartment",
                images, "residential", "multi-family"
            )
        )

        properties.add(
            Property("1", "2933", "Montana", "Ave",
                "Cincinnati", "OH", "45211", 4.5, 2.5,
                "$40,000", "2,500",
                "2 family in westwood", "Prospect", "my last apartment",
                images, "residential", "multi-family"
            )
        )

        properties.add(
            Property("1", "2933", "Montana", "Ave",
                "Cincinnati", "OH", "45211", 4.5, 2.5,
                "$40,000", "2,500",
                "2 family in westwood", "Prospect", "my last apartment",
                images, "residential", "multi-family"
            )
        )

        properties.add(
            Property("1", "2933", "Montana", "Ave",
                "Cincinnati", "OH", "45211", 4.5, 2.5,
                "$40,000", "2,500",
                "2 family in westwood", "Prospect", "my last apartment",
                images, "residential", "multi-family"
            )
        )

        adapter.updateData(properties)

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