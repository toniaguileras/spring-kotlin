package com.adevinta.toniaguilera.service

import com.adevinta.toniaguilera.model.User
import com.adevinta.toniaguilera.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val userRepo: UserRepository) {

    fun sayHello(name: String): String {
        val user: User = userRepo.findByName(name)
        return "hello, nice to meet you ${user.name}"
    }
}