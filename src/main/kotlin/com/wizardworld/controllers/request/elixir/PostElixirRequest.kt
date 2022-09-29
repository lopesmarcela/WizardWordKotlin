package com.wizardworld.controllers.request.elixir

import com.fasterxml.jackson.annotation.JsonAlias
import com.wizardworld.models.elixir.ElixirDifficulty
import com.wizardworld.models.elixir.Ingredient
import com.wizardworld.models.wizard.WizardModel
import java.util.UUID
import javax.persistence.*

data class PostElixirRequest (
    val name: String,
    val effect: String,
    @JsonAlias("side_effects")
    val sideEffects: String,
    val characteristics: String,
    val time: String,
    val difficulty: ElixirDifficulty,
    val manufacturer: String,
    @JsonAlias("ingredient_ids")
    val ingredientIds: List<UUID>,
    @JsonAlias("wizard_ids")
    val wizardIds: List<UUID>,
)