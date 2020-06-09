package com.pokeapi.model

import kotlinx.serialization.*

@Serializable
data class Pokemons (
    val count: Long,
    val next: String,
    val previous: String? = null,
    val results: List<Result>
)

@Serializable
data class Result (
    val name: String,
    val url: String
)
