package com.wizardworld.repositories.magicalCreatures

import com.wizardworld.models.magicalCreature.MagicalCreatureModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface MagicalCreatureRepository: CrudRepository<MagicalCreatureModel, UUID> {
}