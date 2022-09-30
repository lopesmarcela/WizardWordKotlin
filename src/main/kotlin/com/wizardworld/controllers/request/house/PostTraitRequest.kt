package com.wizardworld.controllers.request.house

import com.fasterxml.jackson.annotation.JsonAlias
import com.wizardworld.models.enums.TraitName
import java.util.UUID

data class PostTraitRequest (
    val name: TraitName,
    @JsonAlias("house_id")
    val houseId: UUID
)