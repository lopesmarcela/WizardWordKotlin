package com.wizardworld.models.magicalCreature

import com.fasterxml.jackson.annotation.JsonAlias
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "creature_relations")
data class CreatureRelation (
    @Id
    @GeneratedValue
    val id: UUID,
    @ManyToOne
    @JoinColumn(name = "creature_id")
    val creature: MagicalCreatureModel? = null,
)
