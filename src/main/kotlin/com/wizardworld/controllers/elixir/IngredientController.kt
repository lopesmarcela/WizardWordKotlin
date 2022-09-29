package com.wizardworld.controllers.elixir

import com.wizardworld.controllers.request.elixir.PostIngredientRequest
import com.wizardworld.extensions.toIngredient
import com.wizardworld.models.elixir.Ingredient
import com.wizardworld.services.elixir.IngredientService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("ingredients")
class IngredientController(
    private val ingredientService: IngredientService
) {

    @GetMapping
    fun findAll(): MutableIterable<Ingredient> =
        ingredientService.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): Ingredient =
        ingredientService.findById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody ingredient: PostIngredientRequest){
        ingredientService.create(ingredient.toIngredient())
    }
}