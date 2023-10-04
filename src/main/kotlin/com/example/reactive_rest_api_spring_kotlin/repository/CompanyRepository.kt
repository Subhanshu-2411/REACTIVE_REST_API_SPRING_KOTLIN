package com.example.reactive_rest_api_spring_kotlin.repository

import com.example.reactive_rest_api_spring_kotlin.model.Company
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface CompanyRepository: ReactiveMongoRepository<Company, Long> {

    fun findByNameContaining(name: String): Flux<Company>

}