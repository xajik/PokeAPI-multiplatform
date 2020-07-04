//
//  PokemonObserver.swift
//  PokeApi
//
//  Created by Igor Steblii on 4/7/20.
//  Copyright © 2020 Igor Steblii. All rights reserved.
//

import Foundation
import SharedCode

class PokemonObserver: ObservableObject {

  @Published var items: [Pokemon] = []

  private let vm = PokemoViewModel.init()

  init() {
    vm.items.watch { data in
      if let data = data, let items = data as? Array<Pokemon> {
        self.items.removeAll()
        self.items.append(contentsOf: items)
      }
    }
  }

  func load() {
    vm.load()
  }

}
