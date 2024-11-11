package com.projectx.projectx.app.role;

public class RoleMapper {
    public static Role toEntity(RoleDto roleDto){
        Role role = new Role();

        role.setCode(roleDto.getCode());
        role.setName(roleDto.getName());

        return role;
    }

    public static RoleResponse toRoleResponse(Role role){
        RoleResponse roleResponse = new RoleResponse();
        roleResponse.setId(role.getId());
        roleResponse.setCode(role.getCode());
        roleResponse.setName(role.getName());

        return roleResponse;
    }
}
