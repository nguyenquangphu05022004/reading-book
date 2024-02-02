package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.RoleDto;
import com.example.metruyenchu.entity.Role;
import org.springframework.stereotype.Component;

@Component
public class IRoleConvert implements GenericConvert<Role, RoleDto> {
    @Override
    public Role toEntity(RoleDto roleDto) {
        Role role = new Role(roleDto.getCode());
        return role;
    }

    @Override
    public RoleDto toDto(Role role) {
        RoleDto roleDto = new RoleDto(role.getId(), role.getCode());
        return roleDto;
    }

    @Override
    public Role toEntity(Role role, RoleDto roleDto) {
        role.setCode(roleDto.getCode());
        return role;
    }

    @Override
    public RoleDto toDto(RoleDto roleDto, Role role) {
        return null;
    }
}
