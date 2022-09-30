package com.wizardworld.controllers

import com.wizardworld.controllers.request.wizard.PostWizardRequest
import com.wizardworld.extensions.toWizard
import com.wizardworld.models.WizardModel
import com.wizardworld.services.WizardService
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
import java.util.UUID

@RestController
@Api(tags = ["","Wizard"])
@RequestMapping("wizards")
class WizardController(
    private val wizardService: WizardService
) {

    @ApiOperation("Retorna todos os magos")
    @GetMapping
    fun findAll(): MutableIterable<WizardModel> =
        wizardService.findAll()

    @ApiOperation("Retorna um mago por id")
    @GetMapping("/{id}")
    fun findById(@PathVariable id: UUID): WizardModel =
        wizardService.findById(id)

    @ApiOperation("Cria um mago")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody wizard: PostWizardRequest){
        wizardService.create(wizard.toWizard())
    }
}