package com.wizardworld.repositories

import com.wizardworld.models.WizardModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface WizardRepository: CrudRepository<WizardModel, UUID> {
}