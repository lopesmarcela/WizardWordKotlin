package com.wizardworld.controllers

import com.wizardworld.controllers.request.magicalCreatures.PostMagicalCreatureRequest
import com.wizardworld.extensions.toMagicalCreature
import com.wizardworld.models.MagicalCreatureModel
import com.wizardworld.services.MagicalCreatureService
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
@Api(tags = ["","Magical Creatures"])
@RequestMapping("magical_creatures")
class MagicalCreatureController(
    private val magicalCreatureService: MagicalCreatureService
) {
    @ApiOperation("Cria uma criatura mágica")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create (@RequestBody magicalCreature: PostMagicalCreatureRequest){
        var relatedCreatures: MutableIterable<MagicalCreatureModel>? = null
        if(magicalCreature.relatedCreaturesIds != null) {
            relatedCreatures = magicalCreatureService.findAllById(magicalCreature.relatedCreaturesIds)
        }
        magicalCreatureService.create(magicalCreature.toMagicalCreature(relatedCreatures?.toList()))
    }

    @ApiOperation("Retorna todas as criaturas mágicas")
    @GetMapping
    fun findAll (): MutableIterable<MagicalCreatureModel> =
        magicalCreatureService.findAll()

    @ApiOperation("Retorna uma criatura mágica por id")
    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): MagicalCreatureModel =
        magicalCreatureService.findById(id)
}