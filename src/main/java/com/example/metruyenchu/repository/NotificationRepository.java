package com.example.metruyenchu.repository;

import com.example.metruyenchu.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findAllByBookIdAndAndHasNotificated(Long bookId, boolean isNotificated);

}
