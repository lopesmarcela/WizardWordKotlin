package com.wizardworld.controllers.magicalCreatures

import com.wizardworld.controllers.request.magicalCreatures.PostMagicalCreatureRequest
import com.wizardworld.extensions.toMagicalCreature
import com.wizardworld.models.magicalCreature.MagicalCreatureModel
import com.wizardworld.services.magicalCreatures.MagicalCreatureService
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
@RequestMapping("magical_creatures")
class MagicalCreatureController(
    private val magicalCreatureService: MagicalCreatureService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create (@RequestBody magicalCreature: PostMagicalCreatureRequest){
        magicalCreatureService.create(magicalCreature.toMagicalCreature())
    }

    @GetMapping
    fun findAll (): MutableIterable<MagicalCreatureModel> =
        magicalCreatureService.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): MagicalCreatureModel =
        magicalCreatureService.findById(id)
}