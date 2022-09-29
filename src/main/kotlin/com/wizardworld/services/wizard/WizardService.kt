package com.wizardworld.services.wizard

import com.wizardworld.models.wizard.WizardModel
import com.wizardworld.repositories.wizard.WizardRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class WizardService(
    private val wizardRepository: WizardRepository
) {
    fun findAll(): MutableIterable<WizardModel> =
        wizardRepository.findAll()

    fun findById(id: UUID): WizardModel =
        wizardRepository.findById(id).orElseThrow()

    fun create(wizard: WizardModel){
        wizardRepository.save(wizard)
    }
}