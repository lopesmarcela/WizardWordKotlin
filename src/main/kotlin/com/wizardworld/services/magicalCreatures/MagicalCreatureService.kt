package com.wizardworld.services.magicalCreatures

import com.wizardworld.models.magicalCreature.MagicalCreatureModel
import com.wizardworld.repositories.magicalCreatures.MagicalCreatureRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class MagicalCreatureService(
    private val magicalCreatureRepository: MagicalCreatureRepository
) {
    fun create (magicalCreature: MagicalCreatureModel){
        magicalCreatureRepository.save(magicalCreature)
    }

    fun findAll(): MutableIterable<MagicalCreatureModel> =
        magicalCreatureRepository.findAll()

    fun findById(id: UUID): MagicalCreatureModel =
        magicalCreatureRepository.findById(id).orElseThrow()

    fun findAllById(relatedCreaturesIds: List<UUID>?): MutableIterable<MagicalCreatureModel> {
        return magicalCreatureRepository.findAllById(relatedCreaturesIds!!.toList())
    }
}