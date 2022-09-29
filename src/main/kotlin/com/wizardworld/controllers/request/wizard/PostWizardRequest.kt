package com.wizardworld.controllers.request.wizard

import com.fasterxml.jackson.annotation.JsonAlias
import javax.persistence.Column

data class PostWizardRequest (
    @JsonAlias("first_name")
    val firstName: String,
    @JsonAlias("last_name")
    val lastName: String
)