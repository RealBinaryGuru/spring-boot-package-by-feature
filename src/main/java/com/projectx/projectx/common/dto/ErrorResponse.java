package com.projectx.projectx.common.dto;

public class ErrorResponse {

    private final boolean error = true;
    private Object detail;

    // Constructor
    public ErrorResponse(Object message) {
        this.detail = message;
    }

    // Getter for error (always true)
    public boolean isError() {
        return error;
    }

    // Getter and Setter for detail
    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }
}
