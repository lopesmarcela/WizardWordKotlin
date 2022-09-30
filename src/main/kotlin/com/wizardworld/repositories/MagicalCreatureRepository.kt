package com.wizardworld.repositories

import com.wizardworld.models.MagicalCreatureModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface MagicalCreatureRepository: CrudRepository<MagicalCreatureModel, UUID> {
}