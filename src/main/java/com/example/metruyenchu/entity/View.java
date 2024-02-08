package com.example.metruyenchu.entity;

import com.example.metruyenchu.entity.BookViewCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "views")
@Builder
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class View {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer viewsByDay;
    private Integer viewsByMonth;
    private Integer viewsByWeek;
    private Integer viewsTotal;

    @ManyToOne
    @JoinColumn(name = "book_view_category_id")
    private BookViewCategory bookViewCategory;
    @ManyToOne
    @JoinColumn(name = "book_view_id")
    private BookView bookView;
}
