package com.wizardworld.extensions

import com.fasterxml.jackson.annotation.JsonAlias
import com.wizardworld.controllers.request.house.PostHouseRequest
import com.wizardworld.controllers.request.spell.PostSpellRequest
import com.wizardworld.models.house.HouseModel
import com.wizardworld.models.spell.SpellModel
import java.util.*


fun PostSpellRequest.toSpell():SpellModel{
    return SpellModel(
        name = this.name,
        effect = this.effect,
        canBeVerbal = this.canBeVerbal,
        type = this.type,
        light = this.light,
        creator = this.creator
    )
}

fun PostHouseRequest.toHouse(): HouseModel {
    return HouseModel(
        name = this.name,
        houseColours = this.houseColours,
        founder = this.founder,
        animal = this.animal,
        element = this.element,
        ghost = this.ghost,
        commonRoom = this.commonRoom,
    )
}