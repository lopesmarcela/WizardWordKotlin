package com.wizardworld.controllers

import com.wizardworld.controllers.request.house.PostHouseHeadRequest
import com.wizardworld.extensions.toHouseHead
import com.wizardworld.models.HouseHead
import com.wizardworld.services.HouseHeadService
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
@Api(tags = ["","House Head"])
@RequestMapping("house_heads")
class HouseHeadController(
    private val houseHeadService: HouseHeadService,
    private val houseService: HouseService
) {
    @ApiOperation("Cria um house head")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create (@RequestBody houseHead: PostHouseHeadRequest){
        var house = houseService.findById(houseHead.houseId)
        houseHeadService.create(houseHead.toHouseHead(house))
    }

    @ApiOperation("Retorna todos os house headers")
    @GetMapping
    fun findAll (): MutableIterable<HouseHead>{
        return houseHeadService.findAll()
    }

    @ApiOperation("Retorna um house header por id")
    @GetMapping("/{id}")
    fun findById (@PathVariable id: UUID): HouseHead {
        return houseHeadService.findById(id)
    }
}
