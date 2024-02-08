package com.example.metruyenchu.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;
@Entity
@Table(name = "book_views")
@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class BookView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime day;

    private LocalDateTime week;

    private LocalDateTime month;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @OneToMany(mappedBy = "bookView")
    private List<View> views;
}
