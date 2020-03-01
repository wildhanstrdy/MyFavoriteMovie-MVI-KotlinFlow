package com.wildonestudio.myfavoritemovie.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class CommonModule {

    @Provides
    fun provideContext(app:Application): Context = app

}