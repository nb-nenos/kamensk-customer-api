package com.customerAPI.services

import com.customerAPI.dtos.CreateCustomerDto
import com.customerAPI.dtos.response.CreateCustomerResponseDto
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.util.UUID

@Service
class UserService {

    fun createUser(payload: CreateCustomerDto): CreateCustomerResponseDto =
        CreateCustomerResponseDto(
            UUID.randomUUID().toString(),
            LocalDate.now().toString())

}