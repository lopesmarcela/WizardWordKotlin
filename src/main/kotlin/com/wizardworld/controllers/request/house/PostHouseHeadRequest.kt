package com.wizardworld.controllers.request.house

import com.fasterxml.jackson.annotation.JsonAlias
import java.util.UUID

data class PostHouseHeadRequest (
    @JsonAlias("first_name")
    val firstName: String,
    @JsonAlias("last_name")
    val lastName: String,
    @JsonAlias("house_id")
    val houseId:UUID
)