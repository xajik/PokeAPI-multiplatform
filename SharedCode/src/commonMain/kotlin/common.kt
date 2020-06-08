package com.pokeapi

import kotlinx.coroutines.CoroutineDispatcher

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}

internal expect val Main: CoroutineDispatcher

internal expect val Background: CoroutineDispatcher