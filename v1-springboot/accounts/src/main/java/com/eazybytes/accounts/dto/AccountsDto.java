package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(description = "Data Transfer Object for Account Information",
        name = "Accounts")
public class AccountsDto {


    @Schema(description = "Account number", example = "123456789012", required = true)
    @NotNull(message = "Account number cannot be null")
    private Long accountNumber;

    @Schema(description = "Account type", example = "Savings", required = true)
    @NotEmpty(message = "Account type cannot be empty")
    private String accountType;

    @Schema(description = "Branch address", example = "123 Main St, City, Country", required = true)
    @NotEmpty(message = "Branch address cannot be empty")
    private String branchAddress;

}
