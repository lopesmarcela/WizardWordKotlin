package com.wizardworld.services

import com.wizardworld.models.Ingredient
import com.wizardworld.repositories.IngredientRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class IngredientService(
    private val ingredientRepository: IngredientRepository
) {
    fun findAll(): MutableIterable<Ingredient> =
        ingredientRepository.findAll()

    fun findById(id: UUID): Ingredient =
        ingredientRepository.findById(id).orElseThrow()

    fun create(ingredient: Ingredient){
        ingredientRepository.save(ingredient)
    }

    fun findAllById(ingredientIds: List<UUID>): MutableIterable<Ingredient> {
        return ingredientRepository.findAllById(ingredientIds)
    }
}