package com.projectx.projectx.app.role;

import com.projectx.projectx.common.dto.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping
    public ApiResponse<List<Role>> getAllRoles() {
        return new ApiResponse<>(roleService.getAllRoles(),null);
    }

    @GetMapping("/{id}")
    public ApiResponse<Role> getRoleById(@PathVariable Long id) {
        return new ApiResponse<>(roleService.getRoleById(id), null);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> deleteRole(Long id) {
        roleService.deleteRole(id);
        return new ApiResponse<>(null, "Role deleted successfully");
    }

    @PostMapping
    public ApiResponse<RoleDto> createRole(@Valid @RequestBody RoleDto roleDto) {
        RoleDto createdRole = roleService.createRole(roleDto);
        return new ApiResponse<>(createdRole, null);
    }
}
