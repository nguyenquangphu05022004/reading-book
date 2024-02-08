package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.UserDto;
import com.example.metruyenchu.service.imp.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/api")
public class IUserController implements GenericController<UserDto> {
    private IUserService userService;

    @Autowired
    public IUserController(IUserService userService) {
        this.userService = userService;
    }

    @Override
    @PostMapping("/users")
    public UserDto create(@RequestBody UserDto object) {
        return userService.saveData(object);
    }

    @Override
    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }

    @Override
    @PutMapping("/users/{id}")
    public UserDto update(@RequestBody UserDto object,
                          @PathVariable(value = "id") Long id) {
        object.setId(id);
        return userService.saveData(object);
    }

    @Override
    @GetMapping("/users")
    public List<UserDto> listObject() {
        return userService.recordOfList();
    }
}
