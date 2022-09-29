package com.wizardworld.models.wizard

import com.fasterxml.jackson.annotation.JsonAlias
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "wizards")
data class WizardModel (
    @Id
    @GeneratedValue
    val id: UUID? = null,
    @Column
    @JsonAlias("first_name")
    val firstName: String,
    @Column
    @JsonAlias("last_name")
    val lastName: String
)