package com.example.metruyenchu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    private Long id;

    private String code;

    @ManyToMany(mappedBy = "roles")
    private User user;
}
