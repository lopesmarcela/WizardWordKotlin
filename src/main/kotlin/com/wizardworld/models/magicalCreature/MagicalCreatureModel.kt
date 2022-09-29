package com.wizardworld.models.magicalCreature

import com.fasterxml.jackson.annotation.JsonAlias
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name="magical_creatures")
data class MagicalCreatureModel (
    @Id
    @GeneratedValue
    val id : UUID? = null,
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
    @Column
    @JsonAlias("native_to")
    val nativeTo: String,


    @ManyToMany(cascade = [CascadeType.ALL])
    @JoinTable(
        name = "related_creatures",
        joinColumns = [JoinColumn(name = "creature_id")],
        inverseJoinColumns = [JoinColumn(name = "related_creatures_ids")],
    )
    @Column(nullable = true)
    val relatedCreatures: List<MagicalCreatureModel>? = null
)