package com.wizardworld.controllers.request.magicalCreatures

import com.fasterxml.jackson.annotation.JsonAlias
import com.wizardworld.models.magicalCreature.CreatureClassificationByMinistryOfMagic
import com.wizardworld.models.magicalCreature.CreatureDangerLevel
import com.wizardworld.models.magicalCreature.CreatureStatus
import java.util.*

data class PostMagicalCreatureRequest (
    val name: String,
    val description: String,
    val classification: CreatureClassificationByMinistryOfMagic,
    val status: CreatureStatus,
    @JsonAlias("danger_level")
    val dangerLevel: CreatureDangerLevel,
    @JsonAlias("native_to")
    val nativeTo: String,
    @JsonAlias("related_creature_ids")
    val relatedCreaturesIds: List<UUID>? = listOf(UUID.fromString(""))
)