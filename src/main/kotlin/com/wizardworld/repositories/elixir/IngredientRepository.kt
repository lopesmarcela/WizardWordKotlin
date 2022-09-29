package com.wizardworld.repositories.elixir

import com.wizardworld.models.elixir.Ingredient
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface IngredientRepository: CrudRepository<Ingredient, UUID> {
}