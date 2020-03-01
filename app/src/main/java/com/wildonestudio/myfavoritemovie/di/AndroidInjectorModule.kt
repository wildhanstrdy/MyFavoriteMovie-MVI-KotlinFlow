package com.wildonestudio.myfavoritemovie.di

import com.wildonestudio.myfavoritemovie.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AndroidInjectorModule {
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}