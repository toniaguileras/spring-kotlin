package com.adevinta.toniaguilera.repository

import com.adevinta.toniaguilera.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


interface UserRepository : CrudRepository<User, Int> {

    fun findByName(name: String): User



}