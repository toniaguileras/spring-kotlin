package com.adevinta.toniaguilera.service

import com.adevinta.toniaguilera.model.User
import com.adevinta.toniaguilera.model.UserDTO
import com.adevinta.toniaguilera.repository.UserRepository
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.*
import org.mockito.Mockito.*


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
        `when`(userRepository.findByName(anyString())).thenReturn(User(null, "toni aguilera"))
        val actual = userService.sayHello("toni aguilera")
        assertThat(actual).isEqualTo("hello, nice to meet you toni aguilera")
    }

    @Test
    internal fun `should create a user`() {
        val userDTO: UserDTO = UserDTO("Alejandro")

        `when`(userRepository.save(any(User::class.java))).thenReturn(any(User::class.java));
        `when`(userService.createUser(any(User::class.java))).thenReturn(userDTO);

        assertThat(userDTO.name).isEqualTo("Alejandro")

    }
}