package com.prestiqe.property_android.di

import javax.inject.Scope

// Utility class to give scope to dagger
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope

@Scope
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
annotation class FragmentScope

@Scope
@Retention(AnnotationRetention.SOURCE)
annotation class ViewModelScope