package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Schema(description = "Data Transfer Object for Response Information",
        name = "Response")
@AllArgsConstructor
public class ResponseDto {

    @Schema(description = "Status code of the response", example = "200", required = true)
    private String statusCode;

    @Schema(description = "Status message of the response", example = "Success", required = true)
    private String statusMsg;
}
