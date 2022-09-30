package com.wizardworld.services

import com.wizardworld.models.HouseHead
import com.wizardworld.repositories.HouseHeadRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class HouseHeadService(
    private val houseHeadRepository: HouseHeadRepository
) {

    fun create (houseHead: HouseHead){
        houseHeadRepository.save(houseHead)
    }

    fun findAll(): MutableIterable<HouseHead> {
        return houseHeadRepository.findAll()
    }

    fun findById(id: UUID): HouseHead {
        return houseHeadRepository.findById(id).orElseThrow()
    }
}