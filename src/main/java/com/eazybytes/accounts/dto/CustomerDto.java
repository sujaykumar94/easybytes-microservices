package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(description = "Data Transfer Object for Customer and Account Information",
        name = "Customer")
public class CustomerDto {


    @Schema(description = "Customer's name", example = "John Doe", required = true)
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    private String name;


    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email cannot be empty")
    private String email;

    @Schema(description = "Customer's mobile number", example = "1234567890", required = true)
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Valid
    @Schema(description = "Account details associated with the customer", required = true)
    private AccountsDto accountsDto;
}
