package com.adevinta.toniaguilera.controller

import com.adevinta.toniaguilera.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

    @Autowired
    private lateinit var userService: UserService;

    @GetMapping("/{name}")
    fun hello(@PathVariable name: String): String {
        return userService.sayHello(name)
    }
}