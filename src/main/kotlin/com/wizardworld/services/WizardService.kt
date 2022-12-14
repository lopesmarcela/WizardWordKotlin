package com.wizardworld.services

import com.wizardworld.models.WizardModel
import com.wizardworld.repositories.WizardRepository
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

    fun findAllById(wizardIds: List<UUID>): MutableIterable<WizardModel> {
        return wizardRepository.findAllById(wizardIds)
    }
}