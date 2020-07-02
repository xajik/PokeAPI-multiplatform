package com.pokeapi

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.pokeapi.model.Pokemon


class PokeListAdapter : RecyclerView.Adapter<PokemonViewHolder>() {

    var items: List<Pokemon> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item, parent, false)
        return PokemonViewHolder(layout)
    }

    override fun getItemCount(): Int  = items.size

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.bind(items[position], position + 1)
    }

}

class PokemonViewHolder(itemView: View) : ViewHolder(itemView) {

    private var id = itemView.findViewById<TextView>(R.id.id_view)
    private var title = itemView.findViewById<TextView>(R.id.name_view)

    fun bind(item: Pokemon, position: Int) {
        id.text = position.toString()
        title.text = item.name
    }

}