package com.wizardworld.services

import com.wizardworld.controllers.request.spell.PostSpellRequest
import com.wizardworld.models.spell.Spell
import com.wizardworld.repositories.SpellRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class SpellService(
    private val spellRepository: SpellRepository
) {

    fun findAll(): MutableIterable<Spell> =
        spellRepository.findAll()

    fun findById(id: UUID): Optional<Spell> =
        spellRepository.findById(id)

    fun create(spell: Spell){
        spellRepository.save(spell)
    }
}