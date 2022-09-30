package com.wizardworld.controllers

import com.wizardworld.controllers.request.house.PostHouseRequest
import com.wizardworld.extensions.toHouse
import com.wizardworld.models.HouseModel
import com.wizardworld.services.HouseService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
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
@Api(tags = ["", "House"])
@RequestMapping("houses")
class HouseController(
    private val houseService: HouseService
) {
    @ApiOperation("Cria uma casa")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create (@RequestBody house: PostHouseRequest){
        houseService.create(house.toHouse())
    }

    @ApiOperation("Retorna todos as casas")
    @GetMapping
    fun findAll (): MutableIterable<HouseModel>{
        return houseService.findAll()
    }

    @ApiOperation("Retorna uma casa por id")
    @GetMapping("/{id}")
    fun findById (@PathVariable id: UUID): HouseModel {
        return houseService.findById(id)
    }
}
