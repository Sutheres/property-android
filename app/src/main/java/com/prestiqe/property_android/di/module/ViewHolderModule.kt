package com.prestiqe.property_android.di.module

import androidx.lifecycle.LifecycleRegistry
import com.prestiqe.property_android.di.ViewModelScope
import com.prestiqe.property_android.ui.base.BaseItemViewHolder
import dagger.Module
import dagger.Provides


@Module
class ViewHolderModule(private val baseItemViewHolder: BaseItemViewHolder<*, *>) {

    @Provides
    @ViewModelScope
    fun provideLifecycleRegistry(): LifecycleRegistry = LifecycleRegistry(baseItemViewHolder)

}