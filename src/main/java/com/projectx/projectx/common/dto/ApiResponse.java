package com.projectx.projectx.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
public class ApiResponse<T> {
    private final boolean error = false;
    private T data;
    private String message;

    public ApiResponse(T data, String message) {
        this.data = data;
        this.message = (message == null || message.isEmpty()) ? "Operate successful" : message;
    }
}