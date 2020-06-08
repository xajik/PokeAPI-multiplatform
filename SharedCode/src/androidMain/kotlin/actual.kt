package com.pokeapi

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual fun platformName(): String {
    return "Android"
}

internal actual val Main: CoroutineDispatcher = Dispatchers.Main

internal actual val Background: CoroutineDispatcher = Dispatchers.Default