package com.wildonestudio.myfavoritemovie.di

import android.app.Application
import com.wildonestudio.myfavoritemovie.MovieApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [CommonModule::class, NetworkModule::class,
    AppAndroidModule::class, AndroidInjectionModule::class])
interface AppComponent {
    fun inject(app: MovieApplication)
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun inject(app: Application): Builder

        fun build(): AppComponent
    }
}
