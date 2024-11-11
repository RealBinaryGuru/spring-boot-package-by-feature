package com.projectx.projectx.app.role;

import com.projectx.projectx.common.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Page<RoleResponse> getAllRoles(Pageable pageable) {
        return roleRepository.findAll(pageable).map(RoleMapper::toRoleResponse);
    }

    public RoleResponse getRoleById(Long id) {
        return roleRepository.findById(id).map(RoleMapper::toRoleResponse).orElseThrow(() -> new ResourceNotFoundException("ROLE_NOT_FOUND"));
    }


    public RoleDto createRole(RoleDto roleDto) {
        return RoleMapper.toDto(roleRepository.save(RoleMapper.toEntity(roleDto)));
    }

    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
