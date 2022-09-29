package com.wizardworld.extensions

import com.wizardworld.controllers.request.elixir.PostElixirRequest
import com.wizardworld.controllers.request.elixir.PostIngredientRequest
import com.wizardworld.controllers.request.house.PostHouseHeadRequest
import com.wizardworld.controllers.request.house.PostHouseRequest
import com.wizardworld.controllers.request.house.PostTraitRequest
import com.wizardworld.controllers.request.magicalCreatures.PostMagicalCreatureRequest
import com.wizardworld.controllers.request.spell.PostSpellRequest
import com.wizardworld.controllers.request.wizard.PostWizardRequest
import com.wizardworld.models.elixir.ElixirModel
import com.wizardworld.models.elixir.Ingredient
import com.wizardworld.models.house.HouseHead
import com.wizardworld.models.house.HouseModel
import com.wizardworld.models.house.Trait
import com.wizardworld.models.magicalCreature.MagicalCreatureModel
import com.wizardworld.models.spell.SpellModel
import com.wizardworld.models.wizard.WizardModel


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

fun PostTraitRequest.toTrait(house: HouseModel): Trait{
    return Trait(
        name = this.name,
        house = house
    )
}

fun PostHouseHeadRequest.toHouseHead(house: HouseModel): HouseHead{
    return HouseHead(
        firstName = this.firstName,
        lastName = this.lastName,
        house = house
    )
}

fun PostMagicalCreatureRequest.toMagicalCreature(relatedCreatures: List<MagicalCreatureModel>?): MagicalCreatureModel{
    return MagicalCreatureModel(
        name = this.name,
        description = this.description,
        classification = this.classification,
        status = this.status,
        dangerLevel = this.dangerLevel,
        nativeTo = this.nativeTo,
        relatedCreatures = relatedCreatures
    )
}

fun PostWizardRequest.toWizard(): WizardModel{
    return WizardModel(
        firstName = this.firstName,
        lastName = this.lastName
    )
}

fun PostIngredientRequest.toIngredient(): Ingredient{
    return Ingredient(
        name = this.name,
    )
}

fun PostElixirRequest.toElixir(ingredients: List<Ingredient>, wizards: List<WizardModel>):ElixirModel{
    return ElixirModel(
        name = this.name,
        effect = this.effect,
        sideEffects = this.sideEffects,
        characteristics = this.characteristics,
        time = this.time,
        difficulty = this.difficulty,
        manufacturer = this.manufacturer,
        ingredients = ingredients,
        inventors = wizards
    )
}