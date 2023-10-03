package com.example.reactive_rest_api_spring_kotlin.model

import org.springframework.data.mongodb.core.mapping.Document

@Document(value = "user")
data class User(
    val id: String,
)
