package com.wizardworld.models.house

import com.fasterxml.jackson.annotation.JsonAlias
import java.util.*
import javax.persistence.*

@Entity
@Table(name="traits")
data class Trait (
    @Id
    @GeneratedValue
    val id: UUID? = null,
    @Column
    @Enumerated(EnumType.STRING)
    val name: TraitName,
    @Column
    @JsonAlias("house_id")
    val houseId: UUID? = null
)
