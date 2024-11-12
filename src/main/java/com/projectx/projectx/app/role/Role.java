package com.projectx.projectx.app.role;

import com.projectx.projectx.common.entity.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String code;

    // No-args constructor
    public Role() {
    }

    // All-args constructor
    public Role(String name, String code) {
        this.name = name;
        this.code = code;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}



