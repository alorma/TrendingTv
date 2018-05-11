package com.alorma.myapplication.domain.repository

import com.alorma.myapplication.commons.subscribeOnIO
import com.alorma.myapplication.domain.model.Configuration
import io.reactivex.Single
import com.alorma.myapplication.data.cache.ConfigDataSource as Cache
import com.alorma.myapplication.data.net.ConfigDataSource as Network

class ConfigurationRepository(private val network: Network, private val cache: Cache) {

    fun getConfig(): Single<Configuration> =
            Single.defer {
                cache.get()?.let {
                    Single.just(it)
                } ?: network.get().doOnSuccess { cache.save(it) }
            }.subscribeOnIO()

}