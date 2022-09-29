package com.wizardworld.controllers.house

import com.wizardworld.controllers.request.house.PostTraitRequest
import com.wizardworld.extensions.toTrait
import com.wizardworld.models.house.Trait
import com.wizardworld.services.house.HouseService
import com.wizardworld.services.house.TraitService
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
@RequestMapping("traits")
class TraitController(
    private val traitService: TraitService,
    private val houseService: HouseService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create (@RequestBody trait: PostTraitRequest){
        var house = houseService.findById(trait.houseId)
        traitService.create(trait.toTrait(house))
    }

    @GetMapping
    fun findAll (): MutableIterable<Trait>{
        return traitService.findAll()
    }

    @GetMapping("/{id}")
    fun findById (@PathVariable id: UUID): Trait{
        return traitService.findById(id)
    }
}
