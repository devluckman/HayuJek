package com.man.hayujek.core

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

/**
 *
 * Created by Lukmanul Hakim on  04/09/22
 * devs.lukman@gmail.com
 */
object KoinStarter {

    fun onCreate(context: Context, module: List<Module> = emptyList()) {

        startKoin {
            androidContext(context)

        }
    }
}