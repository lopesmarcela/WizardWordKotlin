package com.wizardworld.services

import com.wizardworld.models.HouseModel
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

    fun findById(id: UUID): HouseModel {
        return houseRepository.findById(id).orElseThrow()
    }
}