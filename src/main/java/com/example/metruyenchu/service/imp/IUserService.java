package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.IUserConvert;
import com.example.metruyenchu.dto.UserDto;
import com.example.metruyenchu.entity.User;
import com.example.metruyenchu.repository.UserRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserService implements GenericCRUDService<UserDto> {

    private IUserConvert userConvert;
    private UserRepository userRepository;

    @Autowired
    public IUserService(UserRepository userRepository,
                        IUserConvert userConvert) {
        this.userRepository = userRepository;
        this.userConvert = userConvert;
    }

    @Override
    public UserDto saveData(UserDto data) {
        return GenericService.saveData(
                data, data.getId(), userConvert,
                User.class, userRepository
        );
    }

    @Override
    public void delete(Long id) {
         GenericService.deleteById(userRepository, id);
    }

    @Override
    public List<UserDto> recordOfList() {
        return GenericService.recordOfList(userRepository, userConvert);
    }
}
