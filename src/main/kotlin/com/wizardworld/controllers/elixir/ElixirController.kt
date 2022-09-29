package com.wizardworld.controllers.elixir

import com.wizardworld.controllers.request.elixir.PostElixirRequest
import com.wizardworld.extensions.toElixir
import com.wizardworld.models.elixir.ElixirModel
import com.wizardworld.models.elixir.Ingredient
import com.wizardworld.models.magicalCreature.MagicalCreatureModel
import com.wizardworld.models.wizard.WizardModel
import com.wizardworld.services.elixir.ElixirService
import com.wizardworld.services.elixir.IngredientService
import com.wizardworld.services.wizard.WizardService
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
@RequestMapping("elixirs")
class ElixirController(
    private val elixirService: ElixirService,
    private val ingredientService: IngredientService,
    private val wizardService: WizardService
) {

    @GetMapping
    fun findAll(): MutableIterable<ElixirModel> =
        elixirService.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): ElixirModel =
        elixirService.findById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody elixir: PostElixirRequest){
        val ingredients: MutableIterable<Ingredient> = ingredientService.findAllById(elixir.ingredientIds)
        val wizards: MutableIterable<WizardModel> = wizardService.findAllById(elixir.wizardIds)
        elixirService.create(elixir.toElixir(ingredients.toList(), wizards.toList()))
    }
}