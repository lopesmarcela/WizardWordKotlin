package com.wizardworld.controllers.request.house

import com.fasterxml.jackson.annotation.JsonAlias
import java.util.*

data class PostHouseRequest (
    val name: String,
    @JsonAlias("house_colours")
    val houseColours: String,
    val founder: String,
    val animal: String,
    val element: String,
    val ghost: String,
    @JsonAlias("common_room")
    val commonRoom: String,
)