package com.projectx.projectx.common.dto;

public class ErrorResponse {
    private final boolean error = true;
    private String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

}