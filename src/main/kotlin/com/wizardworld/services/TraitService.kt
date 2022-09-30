package com.wizardworld.services

import com.wizardworld.models.Trait
import com.wizardworld.repositories.TraitRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class TraitService(
    private val traitRepository: TraitRepository
) {

    fun create (trait: Trait){
        traitRepository.save(trait)
    }

    fun findAll(): MutableIterable<Trait> {
        return traitRepository.findAll()
    }

    fun findById(id: UUID): Trait {
        return traitRepository.findById(id).orElseThrow()
    }
}