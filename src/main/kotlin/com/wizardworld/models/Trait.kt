package com.wizardworld.models

import com.wizardworld.models.enums.TraitName
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
    @ManyToOne
    @JoinColumn(name="house_id")
    val house: HouseModel? = null
)
