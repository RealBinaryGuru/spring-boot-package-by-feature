package com.projectx.projectx.app.role;

public class RoleMapper {
    public static RoleDto convertEntityToDto(Role role){
        RoleDto roleDto = new RoleDto();

        roleDto.setCode(role.getCode());
        roleDto.setName(role.getName());
        return roleDto;
    }
}
