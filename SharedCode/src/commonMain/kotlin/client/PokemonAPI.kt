package com.pokeapi.client

import com.pokeapi.model.PokemonDetails
import com.pokeapi.model.Pokemons
import com.pokeapi.network.engine
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.get
import kotlinx.serialization.json.Json

class PokemonRepository {

    private val client = HttpClient(engine) {
        install(JsonFeature) {
            serializer = KotlinxSerializer(Json.nonstrict)
        }
    }

    suspend fun get(id: Int): PokemonDetails = client.get("https://pokeapi.co/api/v2/pokemon/$id")

    suspend fun getAll(): Pokemons = client.get("https://pokeapi.co/api/v2/pokemon/")

}