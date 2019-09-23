package com.prestiqe.property_android

import android.app.Application
import com.prestiqe.property_android.di.component.ApplicationComponent
import com.prestiqe.property_android.di.module.ApplicationModule
import com.prestiqe.property_android.di.component.DaggerApplicationComponent

class PropertyApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        getDependencies()

    }

    fun getDependencies() {
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()

        applicationComponent.injectApplication(this)
    }
}