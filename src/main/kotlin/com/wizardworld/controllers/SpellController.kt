package com.wizardworld.controllers

import com.wizardworld.controllers.request.spell.PostSpellRequest
import com.wizardworld.extensions.toSpell
import com.wizardworld.models.spell.Spell
import com.wizardworld.services.SpellService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.Optional
import java.util.UUID

@RestController
@RequestMapping("spells")
class SpellController(
    private val spellService: SpellService
) {

    @GetMapping
    fun findAll(): MutableIterable<Spell> =
        spellService.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): Optional<Spell> =
        spellService.findById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody spell: PostSpellRequest){
        spellService.create(spell.toSpell())
    }
}