package com.wizardworld.repositories.house

import com.wizardworld.models.house.HouseHead
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface HouseHeadRepository: CrudRepository<HouseHead, UUID> {
}