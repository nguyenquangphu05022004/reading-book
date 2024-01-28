package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.dto.NotificationDto;
import com.example.metruyenchu.repository.NotificationRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class INotificationService implements GenericCRUDService<NotificationDto> {

    private NotificationRepository notificationRepository;
    @Autowired
    public INotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public NotificationDto insert(NotificationDto data) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<NotificationDto> recordOfList() {
        return null;
    }

    @Override
    public NotificationDto update(NotificationDto oldData) {
        return null;
    }
}
