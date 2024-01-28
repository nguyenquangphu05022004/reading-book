package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.dto.UserDto;
import com.example.metruyenchu.repository.UserRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserService implements GenericCRUDService<UserDto> {

    private UserRepository userRepository;

    @Autowired
    public IUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto insert(UserDto data) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<UserDto> recordOfList() {
        return null;
    }

    @Override
    public UserDto update(UserDto oldData) {
        return null;
    }
}
