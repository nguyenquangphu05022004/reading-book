package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.RoleDto;
import com.example.metruyenchu.entity.Role;
import org.springframework.stereotype.Component;

@Component
public class IRoleConvert implements GenericConvert<Role, RoleDto> {
    @Override
    public Role toEntity(RoleDto roleDto) {
        return null;
    }

    @Override
    public RoleDto toDto(Role role) {
        return null;
    }

    @Override
    public Role toEntity(Role role, RoleDto roleDto) {
        return null;
    }

    @Override
    public RoleDto toDto(RoleDto roleDto, Role role) {
        return null;
    }
}
