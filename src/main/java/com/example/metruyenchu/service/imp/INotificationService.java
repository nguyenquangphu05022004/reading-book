package com.example.metruyenchu.service.imp;

import com.example.metruyenchu.convert.imp.INotificationConvert;
import com.example.metruyenchu.dto.NotificationDto;
import com.example.metruyenchu.entity.Notification;
import com.example.metruyenchu.repository.NotificationRepository;
import com.example.metruyenchu.service.GenericCRUDService;
import com.example.metruyenchu.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class INotificationService implements GenericCRUDService<NotificationDto> {

    private NotificationRepository notificationRepository;
    private INotificationConvert notificationConvert;
    @Autowired
    public INotificationService(NotificationRepository notificationRepository,
                                INotificationConvert notificationConvert) {
        this.notificationRepository = notificationRepository;
        this.notificationConvert = notificationConvert;
    }

    @Override
    public NotificationDto saveData(NotificationDto data) {
        return GenericService.saveData(
                data, data.getId(), notificationConvert,
                Notification.class, notificationRepository
        );
    }

    @Override
    public void delete(Long id) {
        GenericService.deleteById(notificationRepository, id);
    }

    @Override
    public List<NotificationDto> recordOfList() {
        return GenericService.recordOfList(notificationRepository, notificationConvert);
    }

}
