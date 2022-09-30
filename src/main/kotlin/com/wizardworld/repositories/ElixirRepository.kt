package com.wizardworld.repositories

import com.wizardworld.models.ElixirModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ElixirRepository: CrudRepository<ElixirModel, UUID> {
}