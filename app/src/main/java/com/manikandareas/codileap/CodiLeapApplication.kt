package com.manikandareas.codileap

import android.app.Application
import android.content.pm.ApplicationInfo
import coil.ImageLoader
import com.manikandareas.codileap.di.dataSourceModule
import com.manikandareas.codileap.di.navigationModule
import com.manikandareas.codileap.di.networkModule
import com.manikandareas.codileap.di.validationModule
import com.manikandareas.codileap.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class CodiLeapApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ImageLoader.Builder(this)
            .crossfade(true)
            .build()
        startKoin {
            if (0 != applicationInfo.flags and ApplicationInfo.FLAG_DEBUGGABLE) {
                androidLogger(Level.INFO)
            } else {
                androidLogger(Level.NONE)
            }
            androidContext(this@CodiLeapApplication)
            modules(
                listOf(
                    dataSourceModule,
                    networkModule,
                    navigationModule,
                    validationModule,
                    viewModelModule
                )
            )
        }
    }
}