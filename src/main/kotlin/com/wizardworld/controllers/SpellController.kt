package com.wizardworld.controllers

import com.wizardworld.controllers.request.spell.PostSpellRequest
import com.wizardworld.extensions.toSpell
import com.wizardworld.models.SpellModel
import com.wizardworld.services.SpellService
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
@Api(tags = ["","Spells"])
@RequestMapping("spells")
class SpellController(
    private val spellService: SpellService
) {

    @ApiOperation("Retorna todos os feitiços")
    @GetMapping
    fun findAll(): MutableIterable<SpellModel> =
        spellService.findAll()

    @ApiOperation("Retorna um feitiço por id")
    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): SpellModel =
        spellService.findById(id)

    @ApiOperation("Cria um feitiço")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody spell: PostSpellRequest){
        spellService.create(spell.toSpell())
    }
}