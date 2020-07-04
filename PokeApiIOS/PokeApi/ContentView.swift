//
//  ContentView.swift
//  PokeApi
//
//  Created by Igor Steblii on 7/6/20.
//  Copyright © 2020 Igor Steblii. All rights reserved.
//

import SwiftUI
import SharedCode

struct ContentView: View {

  @EnvironmentObject var pmo: PokemonObserver

  var body: some View {
    NavigationView {
      VStack {
        List(pmo.items) { item in
          PokemonRowView(item: item)
        };
        Button(action: {
          self.pmo.load()
        }) {
          Text("Load Pokemons")
            .font(.title)
            .padding()
        };
      }
      .navigationBarTitle("Pokemon API Kotlin/Native")
    }
  }
}

struct ContentView_Previews: PreviewProvider {
  static var previews: some View {
    ContentView()
  }
}
