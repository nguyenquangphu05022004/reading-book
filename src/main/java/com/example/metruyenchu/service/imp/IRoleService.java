package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IRoleConvert;
import com.example.metruyenchu.dto.RoleDto;
import com.example.metruyenchu.entity.Role;
import com.example.metruyenchu.repository.RoleRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IRoleService implements GenericCRUDService<RoleDto> {

    private RoleRepository roleRepository;
    private IRoleConvert roleConvert;
    @Autowired
    public IRoleService(RoleRepository roleRepository,
                        IRoleConvert roleConvert) {
        this.roleRepository = roleRepository;
        this.roleConvert = roleConvert;
    }

    @Override
    public RoleDto saveData(RoleDto data) {
        return GenericService.saveData(
                data, data.getId(), roleConvert,
                Role.class, roleRepository
        );
    }

    @Override
    public void delete(Long id) {
        GenericService.deleteById(roleRepository, id);
    }

    @Override
    public List<RoleDto> recordOfList() {
        return GenericService.recordOfList(roleRepository, roleConvert);
    }

}
