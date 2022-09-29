package com.wizardworld.models.elixir

import com.fasterxml.jackson.annotation.JsonAlias
import com.wizardworld.models.wizard.WizardModel
import java.util.UUID
import javax.persistence.*

@Entity
@Table(name = "elixirs")
data class ElixirModel (
    @Id
    @GeneratedValue
    val id: UUID? = null,
    @Column
    val name: String,
    @Column
    val effect: String,
    @Column
    @JsonAlias("side_effects")
    val sideEffects: String,
    @Column
    val characteristics: String,
    @Column
    val time: String,
    @Column
    val difficulty: ElixirDifficulty,
    @Column
    val manufacturer: String,

    @ManyToMany(cascade = [CascadeType.ALL])
    @JoinTable(
        name = "elixir_ingredients",
        joinColumns = [JoinColumn(name = "elixir_id")],
        inverseJoinColumns = [JoinColumn(name = "ingredient_ids")],
    )
    val ingredients: List<Ingredient>,
    @ManyToMany(cascade = [CascadeType.ALL])
    @JoinTable(
        name = "elixir_wizards",
        joinColumns = [JoinColumn(name = "elixir_id")],
        inverseJoinColumns = [JoinColumn(name = "wizard_ids")],
    )
    val inventors: List<WizardModel>,

)
