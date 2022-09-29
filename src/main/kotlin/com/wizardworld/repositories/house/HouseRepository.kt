package com.wizardworld.repositories.house

import com.wizardworld.models.house.HouseModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface HouseRepository : CrudRepository<HouseModel, UUID>{
}