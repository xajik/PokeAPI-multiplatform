//
//  PokemonRowView.swift
//  PokeApi
//
//  Created by Igor Steblii on 4/7/20.
//  Copyright © 2020 Igor Steblii. All rights reserved.
//

import Foundation
import SwiftUI
import SharedCode

struct PokemonRowView : View {

  var item: Pokemon

  var body: some View {
    HStack {
      Text("Name: ").bold();
      Text(item.name);
    }
  }

}
