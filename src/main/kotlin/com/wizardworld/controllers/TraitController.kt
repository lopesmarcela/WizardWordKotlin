package com.wizardworld.controllers

import com.wizardworld.controllers.request.house.PostTraitRequest
import com.wizardworld.extensions.toTrait
import com.wizardworld.models.Trait
import com.wizardworld.services.HouseService
import com.wizardworld.services.TraitService
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
import java.util.*

@RestController
@Api(tags = ["","Trait"])
@RequestMapping("traits")
class TraitController(
    private val traitService: TraitService,
    private val houseService: HouseService
) {
    @ApiOperation("Cria um traço")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create (@RequestBody trait: PostTraitRequest){
        var house = houseService.findById(trait.houseId)
        traitService.create(trait.toTrait(house))
    }

    @ApiOperation("Retorna todos os traços")
    @GetMapping
    fun findAll (): MutableIterable<Trait>{
        return traitService.findAll()
    }

    @ApiOperation("Retorna um traço por id")
    @GetMapping("/{id}")
    fun findById (@PathVariable id: UUID): Trait {
        return traitService.findById(id)
    }
}
