package com.wizardworld.repositories.wizard

import com.wizardworld.models.wizard.WizardModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface WizardRepository: CrudRepository<WizardModel, UUID> {
}