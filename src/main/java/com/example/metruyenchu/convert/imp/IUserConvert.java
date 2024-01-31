package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.UserDto;
import com.example.metruyenchu.entity.User;
import org.springframework.stereotype.Component;

@Component
public class IUserConvert implements GenericConvert<User, UserDto> {
    @Override
    public User toEntity(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto toDto(User user) {
        return null;
    }

    @Override
    public User toEntity(User user, UserDto userDto) {
        return null;
    }

    @Override
    public UserDto toDto(UserDto userDto, User user) {
        return null;
    }
}
