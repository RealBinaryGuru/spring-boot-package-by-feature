package com.projectx.projectx.app.role;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class RoleDto {

    @NotNull(message = "Role code cannot be null. Please provide a valid code.")
    @Size(min = 2, max = 50, message = "Role code must be between 2 and 50 characters long.")
    private String code;

    @NotNull(message = "Role name cannot be null. Please provide a valid name.")
    @Size(min = 2, max = 50, message = "Role name must be between 2 and 50 characters long.")
    private String name;
}
