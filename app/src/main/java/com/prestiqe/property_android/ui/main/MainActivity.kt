package com.prestiqe.property_android.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.prestiqe.property_android.R
import com.prestiqe.property_android.di.component.ActivityComponent
import com.prestiqe.property_android.ui.base.BaseActivity
import com.prestiqe.property_android.ui.property.PropertyFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainViewModel>() {

    companion object {
        const val TAG = "MainActivity"
    }

    private var activeFragment: Fragment? = null

    override fun provideLayoutID() = R.layout.activity_main

    override fun injectDependencies(activityComponent: ActivityComponent)
            = activityComponent.inject(this)

    override fun setupView(savedInstanceState: Bundle?) {
        bottomNavigation.run {
            itemIconTintList = null
            setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.navigation_home -> {
                        viewModel.onHomeSelected()
                        true
                    }
                    else -> false
                }
            }
        }
    }

    override fun setupObservers() {
        super.setupObservers()

        viewModel.homeNavigation.observe(this, Observer {
            it.getIfNotHandled()?.run { showHome() }
        })
    }

    private fun showHome() {
        if (activeFragment is PropertyFragment) return

        val fragmentTransaction = supportFragmentManager.beginTransaction()

        var fragment = supportFragmentManager.findFragmentByTag(PropertyFragment.TAG) as PropertyFragment?

        if (fragment == null) {
            fragment = PropertyFragment.newInstance()
            fragmentTransaction.add(R.id.containerFragment, fragment, PropertyFragment.TAG)
        } else {
            fragmentTransaction.show(fragment)
        }

        if (activeFragment != null) fragmentTransaction.hide(activeFragment as Fragment)

        fragmentTransaction.commit()

        activeFragment = fragment
    }


}
