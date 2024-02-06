package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.UserDto;
import com.example.metruyenchu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IUserConvert implements GenericConvert<User, UserDto> {

    private IRoleConvert roleConvert;
    private INotificationConvert notificationConvert;
    @Autowired
    public IUserConvert(IRoleConvert roleConvert,
                        INotificationConvert notificationConvert) {
        this.roleConvert = roleConvert;
        this.notificationConvert = notificationConvert;
    }
    @Override
    public User toEntity(UserDto userDto) {
        User user = User.builder()
                .account(User.Account
                        .builder()
                        .username(userDto.getAccount().getUsername())
                        .password(userDto.getAccount().getPassword()).build())
                .roles(roleConvert.toEntity(userDto.getRoles()))
                .build();
        return user;
    }

    @Override
    public UserDto toDto(User user) {
        UserDto userDto =  UserDto.builder()
                .account(UserDto.AccountDto.builder()
                        .username(user.getAccount().getUsername()).build())
                .roles(roleConvert.toDto(user.getRoles()))
                .id(user.getId())
                .notificationDtos(notificationConvert.toDto(user.getNotifications().stream().toList()))
                .build();
        return userDto;
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
