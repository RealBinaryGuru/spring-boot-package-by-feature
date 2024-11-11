package com.projectx.projectx.app.role;

import com.projectx.projectx.common.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(Long id) {
        return roleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Role not found"));
    }


    public RoleDto createRole(RoleDto roleDto) {
        Role role = RoleMapper.toEntity(roleDto);
        Role saveRole = roleRepository.save(role);

        return RoleMapper.toDto(saveRole);
    }

    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
}
