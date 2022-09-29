package com.wizardworld.models.elixir

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "ingredients")
data class Ingredient (
    @Id
    @GeneratedValue
    val id: UUID? = null,
    @Column
    val name: String
)