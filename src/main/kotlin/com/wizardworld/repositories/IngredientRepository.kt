package com.wizardworld.repositories

import com.wizardworld.models.Ingredient
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface IngredientRepository: CrudRepository<Ingredient, UUID> {
}