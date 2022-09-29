package com.wizardworld.controllers.request.house

import com.fasterxml.jackson.annotation.JsonAlias
import com.wizardworld.models.house.HouseModel
import java.util.UUID
import javax.persistence.Column
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

data class PostHouseHeadRequest (
    @JsonAlias("first_name")
    val firstName: String,
    @JsonAlias("last_name")
    val lastName: String,
    @JsonAlias("house_id")
    val houseId:UUID
)