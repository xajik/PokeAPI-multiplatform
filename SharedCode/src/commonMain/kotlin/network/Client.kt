package com.pokeapi.network

import io.ktor.client.engine.HttpClientEngine
import kotlinx.coroutines.CoroutineDispatcher


internal expect val Main: CoroutineDispatcher

internal expect val Background: CoroutineDispatcher

internal expect val engine: HttpClientEngine