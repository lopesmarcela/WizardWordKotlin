package com.wizardworld.repositories

import com.wizardworld.models.house.HouseModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface HouseRepository : CrudRepository<HouseModel, UUID>{
}