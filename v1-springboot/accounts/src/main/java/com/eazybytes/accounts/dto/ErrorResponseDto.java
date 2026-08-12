package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(description = "Data Transfer Object for Error Response Information",
        name = "ErrorResponse")
@Data
@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(description = "API path where the error occurred", example = "/api/v1/accounts", required = true)
    private String apiPath;

    @Schema(description = "HTTP status code of the error", example = "404", required = true)
    private HttpStatus errorCode;

    @Schema(description = "Error message describing the error", example = "Resource not found", required = true)
    private String errorMessage;

    @Schema(description = "Timestamp when the error occurred", example = "2024-06-01T12:00:00", required = true)
    private LocalDateTime errorTime;
}
