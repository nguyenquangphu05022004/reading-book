package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.convert.GenericConvertTw;
import com.example.metruyenchu.dto.RoleDto;
import com.example.metruyenchu.entity.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IRoleConvert implements GenericConvert<Role, RoleDto>,
        GenericConvertTw<Role, RoleDto> {
    @Override
    public Role toEntity(RoleDto roleDto) {
        Role role = Role.builder()
                .code(roleDto.getCode())
                .id(roleDto.getId())
                .build();
        return role;
    }

    @Override
    public RoleDto toDto(Role role) {
        RoleDto roleDto = RoleDto.builder()
                .id(role.getId())
                .code(role.getCode())
                .build();
        return roleDto;
    }

    @Override
    public Role toEntity(Role role, RoleDto roleDto) {
        return null;
    }

    @Override
    public RoleDto toDto(RoleDto roleDto, Role role) {
        return null;
    }

    @Override
    public List<Role> toEntity(List<RoleDto> list) {
        return list.stream().map((dto) -> toEntity(dto)).toList();
    }

    @Override
    public List<RoleDto> toDto(List<Role> list) {
        return list.stream().map(e -> toDto(e)).toList();
    }
}
