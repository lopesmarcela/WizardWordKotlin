package com.wizardworld.services

import com.wizardworld.models.spell.SpellModel
import com.wizardworld.repositories.SpellRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class SpellService(
    private val spellRepository: SpellRepository
) {

    fun findAll(): MutableIterable<SpellModel> =
        spellRepository.findAll()

    fun findById(id: UUID): Optional<SpellModel> =
        spellRepository.findById(id)

    fun create(spell: SpellModel){
        spellRepository.save(spell)
    }
}