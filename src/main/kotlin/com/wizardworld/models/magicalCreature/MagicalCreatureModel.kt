package com.wizardworld.models.magicalCreature

import com.fasterxml.jackson.annotation.JsonAlias
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name="magical_creatures")
data class MagicalCreatureModel (
    @Id
    @GeneratedValue
    val id : UUID,
    @Column
    val name: String,
    @Column
    val description: String,
    @Column
    val classification: CreatureClassificationByMinistryOfMagic,
    @Column
    val status: CreatureStatus,
    @Column
    @JsonAlias("danger_level")
    val dangerLevel:CreatureDangerLevel,
    @OneToMany(fetch = FetchType.LAZY,cascade = arrayOf(CascadeType.ALL))
    val creatureRelations: List<CreatureRelation>,
    @Column
    @JsonAlias("native_to")
    val nativeTo: String
)