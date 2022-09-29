package com.wizardworld.services.house

import com.wizardworld.models.house.HouseModel
import com.wizardworld.models.house.Trait
import com.wizardworld.repositories.house.TraitRepository
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