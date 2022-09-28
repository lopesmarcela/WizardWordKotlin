package com.wizardworld.repositories

import com.wizardworld.models.spell.Spell
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface SpellRepository: CrudRepository<Spell, UUID> {
}