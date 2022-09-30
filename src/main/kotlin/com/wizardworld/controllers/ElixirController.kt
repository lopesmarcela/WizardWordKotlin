package com.wizardworld.controllers

import com.wizardworld.controllers.request.elixir.PostElixirRequest
import com.wizardworld.extensions.toElixir
import com.wizardworld.models.ElixirModel
import com.wizardworld.models.Ingredient
import com.wizardworld.models.WizardModel
import com.wizardworld.services.ElixirService
import com.wizardworld.services.IngredientService
import com.wizardworld.services.WizardService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
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
@Api(tags = ["","Elixir"])
@RequestMapping("elixirs")
class ElixirController(
    private val elixirService: ElixirService,
    private val ingredientService: IngredientService,
    private val wizardService: WizardService
) {

    @ApiOperation("Retorna todas os elixires")
    @GetMapping
    fun findAll(): MutableIterable<ElixirModel> =
        elixirService.findAll()

    @ApiOperation("Retorna um elixir por id")
    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): ElixirModel =
        elixirService.findById(id)

    @ApiOperation("Cria um elixir")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody elixir: PostElixirRequest){
        val ingredients: MutableIterable<Ingredient> = ingredientService.findAllById(elixir.ingredientIds)
        val wizards: MutableIterable<WizardModel> = wizardService.findAllById(elixir.wizardIds)
        elixirService.create(elixir.toElixir(ingredients.toList(), wizards.toList()))
    }
}