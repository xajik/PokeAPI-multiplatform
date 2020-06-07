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
    var body: some View {
        Text(CommonKt.createApplicationScreenMessage())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
