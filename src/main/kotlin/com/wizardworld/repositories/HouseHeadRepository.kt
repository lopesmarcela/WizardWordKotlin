package com.wizardworld.repositories

import com.wizardworld.models.HouseHead
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface HouseHeadRepository: CrudRepository<HouseHead, UUID> {
}