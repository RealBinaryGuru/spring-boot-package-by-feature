package com.projectx.projectx.common.dto;

import lombok.Data;

@Data
public class ErrorResponse {
    private final boolean error = true;
    private Object detail;

    public ErrorResponse(Object message) {
        this.detail = message;
    }

}