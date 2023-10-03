package com.example.reactive_rest_api_spring_kotlin.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

@Document(value = "user")
data class User(
    @Id
    @Indexed(unique = true)
    val id: Long? = null,
    val email: String,
    val name: String,
    val age: Int,
    val companyId: Long
)
