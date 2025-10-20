package com.customerAPI.dtos

import com.customerAPI.config.AddressProperties
import com.customerAPI.config.PhoneNumberProperties
import com.customerAPI.enums.UserTypeEnum

data class CreateCustomerDto(
    val fullName: String,
    val dateOfBirth: String,
    val cpf: String,
    val email: String,
    val password: String,
    val motherName: String,
    val address: List<AddressProperties>,
    val phoneNumber: List<PhoneNumberProperties>,
    val type: UserTypeEnum,
    val safetyPhrase: String
)

