package com.example.reactive_rest_api_spring_kotlin.service

import com.example.reactive_rest_api_spring_kotlin.repository.UserRepository

class UserServiceImplementation(
    private val userRepository: UserRepository
) : UserService {

}