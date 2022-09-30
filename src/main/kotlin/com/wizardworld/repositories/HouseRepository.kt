package com.wizardworld.repositories

import com.wizardworld.models.HouseModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface HouseRepository : CrudRepository<HouseModel, UUID>{
}