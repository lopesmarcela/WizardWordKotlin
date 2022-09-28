package com.wizardworld.extensions

import com.wizardworld.controllers.request.spell.PostSpellRequest
import com.wizardworld.models.spell.Spell


fun PostSpellRequest.toSpell():Spell{
    return Spell(
        name = this.name,
        effect = this.effect,
        canBeVerbal = this.canBeVerbal,
        type = this.type,
        light = this.light,
        creator = this.creator
    )
}