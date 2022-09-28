package com.wizardworld.models.spell

import com.fasterxml.jackson.annotation.JsonAlias
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "spells")
data class SpellModel(
    @Id
    @GeneratedValue
    val id: UUID? = null,
    @Column
    val name: String,
    @Column
    val effect: String,
    @Column
    @JsonAlias("can_be_verbal")
    val canBeVerbal: Boolean,
    @Column
    @Enumerated(EnumType.STRING)
    val type: SpellType,
    @Column
    @Enumerated(EnumType.STRING)
    val light: SpellLight,
    @Column
    val creator: String
)