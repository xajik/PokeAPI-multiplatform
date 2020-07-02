package com.pokeapi.vm

import com.pokeapi.client.PokemonRepository
import com.pokeapi.model.Pokemon
import com.pokeapi.model.PokemonDetails
import com.pokeapi.utils.wrap
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.launch


class PokemoViewModel : BaseViewModel() {

    private var api = PokemonRepository()
    private val _items = ConflatedBroadcastChannel<List<Pokemon>>()

    val items = _items.wrap()

    @ExperimentalCoroutinesApi
    fun load() {
        clientScope.launch {
            _items.offer(api.getAll().results)
        }
    }

}