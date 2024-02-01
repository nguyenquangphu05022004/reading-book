package com.example.metruyenchu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    private Long id;

    private String code;

    @ManyToMany(mappedBy = "roles")
    private List<User> user = new ArrayList<>();
}
