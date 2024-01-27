package com.example.metruyenchu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Book book;



}
