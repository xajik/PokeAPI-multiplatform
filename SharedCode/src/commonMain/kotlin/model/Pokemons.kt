package com.pokeapi.model

import kotlinx.serialization.*

@Serializable
data class Pokemons (
    val count: Long,
    val next: String,
    val previous: String? = null,
    val results: List<Pokemon>
)

@Serializable
data class Pokemon (
    val name: String,
    val url: String
)
