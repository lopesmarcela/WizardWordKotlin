package com.wizardworld.controllers.house

import com.wizardworld.controllers.request.house.PostHouseHeadRequest
import com.wizardworld.extensions.toHouseHead
import com.wizardworld.models.house.HouseHead
import com.wizardworld.services.house.HouseHeadService
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
@RequestMapping("house_heads")
class HouseHeadController(
    private val houseHeadService: HouseHeadService,
    private val houseService: HouseService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create (@RequestBody houseHead: PostHouseHeadRequest){
        var house = houseService.findById(houseHead.houseId)
        houseHeadService.create(houseHead.toHouseHead(house))
    }

    @GetMapping
    fun findAll (): MutableIterable<HouseHead>{
        return houseHeadService.findAll()
    }

    @GetMapping("/{id}")
    fun findById (@PathVariable id: UUID): HouseHead{
        return houseHeadService.findById(id)
    }
}
