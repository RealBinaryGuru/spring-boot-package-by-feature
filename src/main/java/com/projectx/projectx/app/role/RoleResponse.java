package com.projectx.projectx.app.role;

public class RoleResponse {
    private long id;
    private String code;
    private String name;

    // No-args constructor
    public RoleResponse() {
    }

    // All-args constructor
    public RoleResponse(long id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
