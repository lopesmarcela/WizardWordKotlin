package com.wizardworld.models.house

import com.fasterxml.jackson.annotation.JsonAlias
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "house_heads")
data class HouseHead (
     @Id
     @GeneratedValue
     val id: UUID? = null,
     @Column
     @JsonAlias("first_name")
     val firstName: String,
     @Column
     @JsonAlias("last_name")
     val lastName: String,
     @Column
     @JsonAlias("house_id")
     val houseId: UUID? = null
)
