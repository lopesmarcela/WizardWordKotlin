package com.wizardworld.controllers.request.spell

import com.fasterxml.jackson.annotation.JsonAlias
import com.wizardworld.models.enums.SpellLight
import com.wizardworld.models.enums.SpellType

data class PostSpellRequest (
    val name: String,
    val effect: String,
    @JsonAlias("can_be_verbal")
    val canBeVerbal: Boolean,
    val type: SpellType,
    val light: SpellLight,
    val creator: String
)