package com.adevinta.toniaguilera.controller

import com.adevinta.toniaguilera.ToniAguileraApplication
import org.hamcrest.Matchers
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@ContextConfiguration(classes = [ToniAguileraApplication::class])
@WebMvcTest(HelloController::class)
class HelloControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    internal fun `should say hello`() {
        mockMvc.perform(get("/hello")).andExpect(status().isOk)
            .andExpect(content().string(Matchers.equalTo("hello toni!")))
    }
}