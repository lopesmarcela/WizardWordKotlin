package com.wizardworld.repositories

import com.wizardworld.models.Trait
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface TraitRepository: CrudRepository<Trait, UUID> {
}