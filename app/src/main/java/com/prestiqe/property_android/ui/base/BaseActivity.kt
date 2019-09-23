package com.prestiqe.property_android.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.prestiqe.property_android.PropertyApplication
import com.prestiqe.property_android.di.component.ActivityComponent
import com.prestiqe.property_android.di.component.DaggerActivityComponent
import com.prestiqe.property_android.di.module.ActivityModule
import com.prestiqe.property_android.utils.common.Toaster
import javax.inject.Inject

abstract class BaseActivity<VM: BaseViewModel>: AppCompatActivity() {

    @Inject
    lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        injectDependencies(buildActivityComponent())
        super.onCreate(savedInstanceState)
        setContentView(provideLayoutID())
        setupObservers()
        setupView(savedInstanceState)
        viewModel.onCreate()
    }

    private fun buildActivityComponent(): ActivityComponent =
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as PropertyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()

    protected open fun setupObservers() {
        viewModel.messageStringId.observe(this, Observer {
            it.data?.run { showMessage(this) }
        })

        viewModel.messageString.observe(this, Observer {
            it.data?.run { showMessage(this) }
        })
    }

    fun showMessage(message: String) = Toaster.show(applicationContext, message)

    fun showMessage(@StringRes resId: Int) = showMessage(getString(resId))

    open fun goBack() = onBackPressed()

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0)
            supportFragmentManager.popBackStackImmediate()
        else super.onBackPressed()
    }

    @LayoutRes
    protected abstract fun provideLayoutID(): Int

    protected abstract fun injectDependencies(activityComponent: ActivityComponent)

    protected abstract fun setupView(savedInstanceState: Bundle?)
}