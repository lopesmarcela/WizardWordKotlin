package com.wizardworld.repositories

import com.wizardworld.models.spell.SpellModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface SpellRepository: CrudRepository<SpellModel, UUID> {
}