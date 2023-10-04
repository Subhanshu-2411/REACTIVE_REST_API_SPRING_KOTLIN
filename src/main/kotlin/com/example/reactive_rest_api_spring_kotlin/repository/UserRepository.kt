package com.example.reactive_rest_api_spring_kotlin.repository

import com.example.reactive_rest_api_spring_kotlin.model.User
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface UserRepository: ReactiveMongoRepository<User, Long?> {

    fun findByNameContaining(name: String): Flux<User>

    fun findByCompanyId(companyId: Long): Flux<User>

    fun findByEmail(email: String): Flux<User>

}