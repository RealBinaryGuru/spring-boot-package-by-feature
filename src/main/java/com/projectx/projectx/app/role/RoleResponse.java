package com.projectx.projectx.app.role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class RoleResponse {
    private long id;
    private String code;
    private String name;
}
