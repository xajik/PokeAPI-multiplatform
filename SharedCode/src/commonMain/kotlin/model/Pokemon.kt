package com.pokeapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pokemon (
    val abilities: List<Ability>,

    @SerialName("base_experience")
    val baseExperience: Long,

    val forms: List<Species>,

    @SerialName("game_indices")
    val gameIndices: List<GameIndex>,

    val height: Long,

    @SerialName("held_items")
    val heldItems: List<HeldItem>,

    val id: Long,

    @SerialName("is_default")
    val isDefault: Boolean,

    @SerialName("location_area_encounters")
    val locationAreaEncounters: String,

    val moves: List<Move>,
    val name: String,
    val order: Long,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Long
)

@Serializable
data class Ability (
    val ability: Species,

    @SerialName("is_hidden")
    val isHidden: Boolean,

    val slot: Long
)

@Serializable
data class Species (
    val name: String,
    val url: String
)

@Serializable
data class GameIndex (
    @SerialName("game_index")
    val gameIndex: Long,

    val version: Species
)

@Serializable
data class HeldItem (
    val item: Species,

    @SerialName("version_details")
    val versionDetails: List<VersionDetail>
)

@Serializable
data class VersionDetail (
    val rarity: Long,
    val version: Species
)

@Serializable
data class Move (
    val move: Species,

    @SerialName("version_group_details")
    val versionGroupDetails: List<VersionGroupDetail>
)

@Serializable
data class VersionGroupDetail (
    @SerialName("level_learned_at")
    val levelLearnedAt: Long,

    @SerialName("move_learn_method")
    val moveLearnMethod: Species,

    @SerialName("version_group")
    val versionGroup: Species
)

@Serializable
data class Sprites (
    @SerialName("back_default")
    val backDefault: String? = null,

    @SerialName("back_female")
    val backFemale: String? = null,

    @SerialName("back_shiny")
    val backShiny: String? = null,

    @SerialName("back_shiny_female")
    val backShinyFemale: String? = null,

    @SerialName("front_default")
    val frontDefault: String,

    @SerialName("front_female")
    val frontFemale: String? = null,

    @SerialName("front_shiny")
    val frontShiny: String,

    @SerialName("front_shiny_female")
    val frontShinyFemale: String? = null
)

@Serializable
data class Stat (
    @SerialName("base_stat")
    val baseStat: Long,

    val effort: Long,
    val stat: Species
)

@Serializable
data class Type (
    val slot: Long,
    val type: Species
)