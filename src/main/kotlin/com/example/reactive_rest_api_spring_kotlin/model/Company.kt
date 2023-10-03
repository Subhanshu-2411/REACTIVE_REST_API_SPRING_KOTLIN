package com.example.reactive_rest_api_spring_kotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document(value = "company")
data class Company(
    @Id
    @Indexed(unique = true)
    val id: Long? = null,
    val name: String,
    val address: String
)
