package com.customerAPI.controllers

import com.customerAPI.dtos.CreateCustomerDto
import com.customerAPI.dtos.response.CreateCustomerResponseDto
import com.customerAPI.services.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer-api")
class UserController(
    private val userService: UserService,
) {

    @PostMapping("/create-user")
    fun createUser(@RequestBody payload: CreateCustomerDto): CreateCustomerResponseDto =
        userService.createUser(payload)

}