package com.wizardworld.controllers.wizard

import com.wizardworld.controllers.request.wizard.PostWizardRequest
import com.wizardworld.extensions.toWizard
import com.wizardworld.models.wizard.WizardModel
import com.wizardworld.services.wizard.WizardService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("wizards")
class WizardController(
    private val wizardService: WizardService
) {

    @GetMapping
    fun findAll(): MutableIterable<WizardModel> =
        wizardService.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): WizardModel =
        wizardService.findById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody wizard: PostWizardRequest){
        wizardService.create(wizard.toWizard())
    }
}