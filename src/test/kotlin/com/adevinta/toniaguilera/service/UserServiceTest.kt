package com.adevinta.toniaguilera.service

import com.adevinta.toniaguilera.model.User
import com.adevinta.toniaguilera.repository.UserRepository
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.*


class UserServiceTest {

    @Mock
    lateinit var userRepository: UserRepository

    @InjectMocks
    private lateinit var userService: UserService


    @BeforeEach
    fun init() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun `should say hello`() {
        Mockito.`when`(userRepository.findByName(ArgumentMatchers.anyString())).thenReturn(User(null, "toni aguilera"))
        val actual = userService.sayHello("toni aguilera")
        Assertions.assertThat(actual).isEqualTo("hello, nice to meet you toni aguilera")
    }
}