package com.adevinta.toniaguilera.service

import org.springframework.stereotype.Service

@Service
class UserService {
    fun sayHello(): String {
        val username = "toni aguilera"
        return "hello, nice to meet you $username"
    }
}