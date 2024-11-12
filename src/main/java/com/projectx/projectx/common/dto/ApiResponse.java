package com.projectx.projectx.common.dto;

public class ApiResponse<T> {
    private final boolean error = false;
    private T data;
    private String message;

    // Constructor
    public ApiResponse(T data, String message) {
        this.data = data;
        this.message = (message == null || message.isEmpty()) ? "Operate successful" : message;
    }

    // Getter for error (always false)
    public boolean isError() {
        return error;
    }

    // Getter and Setter for data
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // Getter and Setter for message
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
