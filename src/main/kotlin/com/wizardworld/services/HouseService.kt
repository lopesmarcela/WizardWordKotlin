package com.wizardworld.services

import com.wizardworld.models.house.HouseModel
import com.wizardworld.repositories.HouseRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class HouseService(
    private val houseRepository: HouseRepository
) {

    fun create (house: HouseModel){
        houseRepository.save(house)
    }

    fun findAll(): MutableIterable<HouseModel> {
        return houseRepository.findAll()
    }

    fun findById(id: UUID): Optional<HouseModel> {
        return houseRepository.findById(id)
    }
}