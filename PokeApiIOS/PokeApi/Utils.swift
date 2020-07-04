//
//  Utils.swift
//  PokeApi
//
//  Created by Igor Steblii on 4/7/20.
//  Copyright © 2020 Igor Steblii. All rights reserved.
//

import Foundation
import SharedCode

extension Pokemon: Identifiable {
  public var id: String { UUID().uuidString }
}
