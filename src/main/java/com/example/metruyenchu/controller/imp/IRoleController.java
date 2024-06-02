package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.RoleDto;
import com.example.metruyenchu.service.imp.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IRoleController implements GenericController<RoleDto> {

    public IRoleService roleService;

    @Autowired
    public IRoleController(IRoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    @PostMapping("/roles")
    public RoleDto create(@RequestBody RoleDto object) {
        return roleService.saveData(object);
    }

    @Override
    @DeleteMapping("/roles/{id}")
    public void delete(@PathVariable("id") Long id) {
        roleService.delete(id);
    }

    @Override
    @PutMapping("/roles/{id}")
    public RoleDto update(RoleDto object,@PathVariable("id") Long id) {
        object.setId(id);
        return roleService.saveData(object);
    }

    @Override
    @GetMapping("/roles")
    public List<RoleDto> listObject() {
        return roleService.recordOfList();
    }
}
