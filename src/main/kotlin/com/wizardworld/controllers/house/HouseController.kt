package com.wizardworld.controllers.house

import com.wizardworld.controllers.request.house.PostHouseRequest
import com.wizardworld.extensions.toHouse
import com.wizardworld.models.house.HouseModel
import com.wizardworld.services.house.HouseService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("houses")
class HouseController(
    private val houseService: HouseService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create (@RequestBody house: PostHouseRequest){
        houseService.create(house.toHouse())
    }

    @GetMapping
    fun findAll (): MutableIterable<HouseModel>{
        return houseService.findAll()
    }

    @GetMapping("/{id}")
    fun findById (@PathVariable id: UUID): HouseModel{
        return houseService.findById(id)
    }
}
