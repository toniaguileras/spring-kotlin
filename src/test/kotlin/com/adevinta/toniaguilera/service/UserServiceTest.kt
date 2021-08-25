package com.adevinta.toniaguilera.service

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.MockitoAnnotations

class UserServiceTest {

    @InjectMocks
    private lateinit var userService: UserService


    @BeforeEach
    fun init() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun `should say hello`() {
        val actual = userService.sayHello()
        Assertions.assertThat(actual).isEqualTo("hello, nice to meet you toni aguilera")
    }
}