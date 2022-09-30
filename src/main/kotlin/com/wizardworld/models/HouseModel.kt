package com.wizardworld.models

import com.fasterxml.jackson.annotation.JsonAlias
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name="houses")
data class HouseModel (
    @Id
    @GeneratedValue
    val id: UUID? = null,
    @Column
    val name: String,
    @Column
    @JsonAlias("house_colours")
    val houseColours: String,
    @Column
    val founder: String,
    @Column
    val animal: String,
    @Column
    val element: String,
    @Column
    val ghost: String,
    @Column
    @JsonAlias("common_room")
    val commonRoom: String,
)