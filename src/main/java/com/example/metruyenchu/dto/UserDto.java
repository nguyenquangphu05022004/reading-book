package com.example.metruyenchu.dto;

import com.example.metruyenchu.entity.Comment;
import com.example.metruyenchu.entity.Evaluation;
import com.example.metruyenchu.entity.Role;
import com.example.metruyenchu.entity.User;
import jakarta.persistence.*;
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


    private List<Role> roles = new ArrayList<>();

    private List<Comment> comments = new ArrayList<>();

    private List<Evaluation> evaluations = new ArrayList<>();


    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    static class AccountDto {
        private String username;
        private String password;
    }
}
