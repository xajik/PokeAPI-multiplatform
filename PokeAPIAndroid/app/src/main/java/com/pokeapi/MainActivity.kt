package com.pokeapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pokeapi.vm.PokemoViewModel

class MainActivity : AppCompatActivity() {

    private var vm = PokemoViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = PokeListAdapter()
        val listView = findViewById<RecyclerView>(R.id.recycler_list)
        listView.adapter = adapter
        listView.layoutManager = LinearLayoutManager(this)

        vm.load()
        vm.items.watch {
            Log.d("MainActivity", "Pokemon: " + it)
            adapter.items = it
            adapter.notifyDataSetChanged()
        }

        findViewById<Button>(R.id.load_more_button).setOnClickListener {
            vm.load()
        }

    }

}
