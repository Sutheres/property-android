package com.prestiqe.property_android.di.module

import android.content.Context
import com.prestiqe.property_android.di.FragmentContext
import com.prestiqe.property_android.di.FragmentScope
import com.prestiqe.property_android.ui.base.BaseFragment
import dagger.Module
import dagger.Provides

@Module
class FragmentModule constructor(private val fragment: BaseFragment<*>) {

    @FragmentContext
    @Provides
    fun provideContext(): Context = fragment.context!!
}