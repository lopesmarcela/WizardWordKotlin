package com.wizardworld.controllers.request.spell

import com.fasterxml.jackson.annotation.JsonAlias
import com.wizardworld.models.spell.SpellLight
import com.wizardworld.models.spell.SpellType
import java.util.*

data class PostSpellRequest (
    val name: String,
    val effect: String,
    @JsonAlias("can_be_verbal")
    val canBeVerbal: Boolean,
    val type: SpellType,
    val light: SpellLight,
    val creator: String
)