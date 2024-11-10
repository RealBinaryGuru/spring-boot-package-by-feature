package com.projectx.projectx.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class ErrorResponse {
    private final boolean error = true;
    private String message;
}