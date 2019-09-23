package com.prestiqe.property_android.di

import javax.inject.Qualifier

@Qualifier
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
annotation class ApplicationContext

@Qualifier
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
annotation class ActivityContext

@Qualifier
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
annotation class FragmentContext