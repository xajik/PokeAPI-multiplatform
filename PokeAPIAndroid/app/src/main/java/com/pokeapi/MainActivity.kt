package com.pokeapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.pokeapi.vm.PokemoViewModel

class MainActivity : AppCompatActivity() {

    var vm = PokemoViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.text_view).setText(createApplicationScreenMessage())

        vm.load()
        vm.items.watch {
            Log.d("MainActivity", "Pokemon: " + it)
        }
    }
}
