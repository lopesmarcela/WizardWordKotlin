package com.wizardworld.models.spell

import java.util.*
data class Spell (
    private val id: UUID,
    private val name: String,
    private val effect: String,
    private val canBeVerbal: Boolean,
    private val type: SpellType,
    private val light: SpellLight,
    private val creator: String
)