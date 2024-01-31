package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.dto.NotificationDto;
import com.example.metruyenchu.entity.Notification;
import org.springframework.stereotype.Component;

@Component

public class INotificationConvert implements GenericConvert<Notification, NotificationDto> {
    @Override
    public Notification toEntity(NotificationDto notificationDto) {
        return null;
    }

    @Override
    public NotificationDto toDto(Notification notification) {
        return null;
    }

    @Override
    public Notification toEntity(Notification notification, NotificationDto notificationDto) {
        return null;
    }

    @Override
    public NotificationDto toDto(NotificationDto notificationDto, Notification notification) {
        return null;
    }
}
