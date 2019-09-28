package com.prestiqe.property_android.data.repository

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.prestiqe.property_android.data.models.Image
import com.prestiqe.property_android.data.models.Property
import com.prestiqe.property_android.di.ApplicationContext
import com.prestiqe.property_android.utils.common.Event
import javax.inject.Inject

class PropertyRepository @Inject constructor(
    @ApplicationContext
    private var context: Context
) {

    var propertiesLiveData = MutableLiveData<ArrayList<Property>>()

    companion object {
        const val TAG = "PropertyRepository"
    }

    fun getProperties() {

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

        propertiesLiveData.postValue(properties)

    }
}