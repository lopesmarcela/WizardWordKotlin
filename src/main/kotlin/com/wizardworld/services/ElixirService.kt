package com.wizardworld.services

import com.wizardworld.models.ElixirModel
import com.wizardworld.repositories.ElixirRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ElixirService(
    private val elixirRepository: ElixirRepository
) {
    fun findAll(): MutableIterable<ElixirModel> =
        elixirRepository.findAll()

    fun findById(id: UUID): ElixirModel =
        elixirRepository.findById(id).orElseThrow()

    fun create(elixir: ElixirModel){
        elixirRepository.save(elixir)
    }
}