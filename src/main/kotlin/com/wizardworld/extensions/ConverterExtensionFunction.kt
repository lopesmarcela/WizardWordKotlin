package com.wizardworld.extensions

import com.wizardworld.controllers.request.spell.PostSpellRequest
import com.wizardworld.models.spell.SpellModel


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