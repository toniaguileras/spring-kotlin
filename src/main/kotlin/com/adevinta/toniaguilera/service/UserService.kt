package com.adevinta.toniaguilera.service

import com.adevinta.toniaguilera.exception.UserNotFoundException
import com.adevinta.toniaguilera.exception.UserWithErrorException
import com.adevinta.toniaguilera.model.User
import com.adevinta.toniaguilera.model.UserDTO
import com.adevinta.toniaguilera.repository.UserRepository
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class UserService(val userRepo: UserRepository) {

    fun sayHello(name: String): String {
        try {
            val user: User = userRepo.findByName(name)
            return "hello, nice to meet you ${user.name}"
        } catch (e: Exception) {
            throw UserNotFoundException("user does not exist!")
        }
    }

    fun createUser(user: User?): UserDTO {
        if (user != null) {
            userRepo.save(user)
            return mapToUserDTO(user)
        }
        throw UserWithErrorException()
    }

    private fun mapToUserDTO(user: User?): UserDTO {

        if (user != null) {
            return UserDTO(user.name)
        } else {
            throw UserWithErrorException()
        }
    }
}
