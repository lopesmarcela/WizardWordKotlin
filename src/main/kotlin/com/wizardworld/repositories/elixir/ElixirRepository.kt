package com.wizardworld.repositories.elixir

import com.wizardworld.models.elixir.ElixirModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ElixirRepository: CrudRepository<ElixirModel, UUID> {
}