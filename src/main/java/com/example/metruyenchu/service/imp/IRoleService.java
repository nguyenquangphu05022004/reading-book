package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.dto.RoleDto;
import com.example.metruyenchu.entity.Role;
import com.example.metruyenchu.repository.RoleRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IRoleService implements GenericCRUDService<RoleDto> {

    private RoleRepository roleRepository;

    @Autowired
    public IRoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public RoleDto insert(RoleDto data) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<RoleDto> recordOfList() {
        return null;
    }

    @Override
    public RoleDto update(RoleDto oldData) {
        return null;
    }
}
