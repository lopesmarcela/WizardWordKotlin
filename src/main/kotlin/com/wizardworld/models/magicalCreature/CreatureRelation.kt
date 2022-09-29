package com.wizardworld.models.magicalCreature

import com.fasterxml.jackson.annotation.JsonAlias
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "creature_relations")
data class CreatureRelation (
    @Id
    @GeneratedValue
    val id: UUID,
    @Column
    @JsonAlias("creature_id")
    val creatureId: UUID,
)
