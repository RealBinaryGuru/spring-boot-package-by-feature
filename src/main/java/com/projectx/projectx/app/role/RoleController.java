package com.projectx.projectx.app.role;

import com.projectx.projectx.common.dto.ApiResponse;
import com.projectx.projectx.common.dto.PaginationApiResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping
    public PaginationApiResponse<RoleResponse> getAllRoles(Pageable pageable) {
        Page<RoleResponse> rolesPage = roleService.getAllRoles(pageable);
        return new PaginationApiResponse<>(rolesPage, null);
    }

    @GetMapping("/{id}")
    public ApiResponse<RoleResponse> getRoleById(@PathVariable Long id) {
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
