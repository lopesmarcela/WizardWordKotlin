package com.wizardworld.repositories.house

import com.wizardworld.models.house.Trait
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface TraitRepository: CrudRepository<Trait, UUID> {
}