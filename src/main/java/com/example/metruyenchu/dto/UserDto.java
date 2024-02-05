package com.example.metruyenchu.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class UserDto {

    private Long id;
    private AccountDto account;


    private List<RoleDto> roles = new ArrayList<>();

    private List<CommentDto> comments = new ArrayList<>();

    private List<EvaluationDto> evaluations = new ArrayList<>();

    private List<NotificationDto> notificationDtos;


    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AccountDto {
        private String username;
        private String password;
    }
}
