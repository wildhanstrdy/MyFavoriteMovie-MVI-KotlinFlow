package com.wildonestudio.myfavoritemovie.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component

@Component(modules = [CommonModule::class])
interface AppComponent {
    fun inject(app: Application)

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        @BindsInstance
        fun application(app: Application): Builder
    }
}
