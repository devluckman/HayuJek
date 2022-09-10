package com.man.hayujek.network

import org.koin.core.annotation.Factory

/**
 *
 * Created by Lukmanul Hakim on  05/09/22
 * devs.lukman@gmail.com
 */
@Factory
class NetworkModule {

    fun get() : ApiGenerator = ApiGenerator()

}