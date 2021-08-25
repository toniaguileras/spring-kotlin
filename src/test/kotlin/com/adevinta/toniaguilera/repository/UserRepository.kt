package com.adevinta.toniaguilera.repository

import com.adevinta.toniaguilera.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository


@Repository
interface UserRepository:CrudRepository<User, Int> {

    @Query("select * from users where name = ?1")
    fun findUserName(name: String): String


}