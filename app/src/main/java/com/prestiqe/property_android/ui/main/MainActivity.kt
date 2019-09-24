package com.prestiqe.property_android.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.prestiqe.property_android.R
import com.prestiqe.property_android.di.component.ActivityComponent
import com.prestiqe.property_android.ui.base.BaseActivity

class MainActivity : BaseActivity<MainViewModel>() {

    companion object {
        const val TAG = "MainActivity"
    }

    override fun provideLayoutID() = R.layout.activity_main

    override fun injectDependencies(activityComponent: ActivityComponent)
            = activityComponent.inject(this)

    override fun setupView(savedInstanceState: Bundle?) {

    }

    override fun setupObservers() {
        super.setupObservers()
    }


}
