package com.example.metruyenchu.convert.imp;

import com.example.metruyenchu.convert.GenericConvert;
import com.example.metruyenchu.convert.GenericConvertTw;
import com.example.metruyenchu.dto.BookDto;
import com.example.metruyenchu.dto.NotificationDto;
import com.example.metruyenchu.dto.UserDto;
import com.example.metruyenchu.entity.Book;
import com.example.metruyenchu.entity.Notification;
import com.example.metruyenchu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class INotificationConvert implements GenericConvert<Notification, NotificationDto>,
        GenericConvertTw<Notification, NotificationDto> {


    private IBookConvert bookConvert;

    @Autowired
    public INotificationConvert(IBookConvert bookConvert) {
        this.bookConvert = bookConvert;
    }

    @Override
    public Notification toEntity(NotificationDto notificationDto) {
        Notification notification =  Notification.builder()
                .book(Book.builder()
                        .id(notificationDto.getBookDto().getId()).build())
                .user(User.builder()
                        .id(notificationDto.getUserDto().getId()).build())
                .hasNotificated(true)
                .build();
        return notification;
    }

    @Override
    public NotificationDto toDto(Notification notification) {
        NotificationDto notificationDto  = NotificationDto
                .builder()
                .message(notification.getMessage())
                .bookDto(bookConvert.toDto(notification.getBook()))
                .hasNotificated(notification.isHasNotificated())
                .sawNotification(notification.isSawNotification())
                .build();
        return notificationDto;
    }

    @Override
    public Notification toEntity(Notification notification, NotificationDto notificationDto) {
        return null;
    }

    @Override
    public NotificationDto toDto(NotificationDto notificationDto, Notification notification) {
        return null;
    }

    @Override
    public List<Notification> toEntity(List<NotificationDto> list) {
        return null;
    }

    @Override
    public List<NotificationDto> toDto(List<Notification> list) {
        List<NotificationDto> notificationDtos =
                list.stream().map((entity) -> {
                    return toDto(entity);
                }).toList();
        return notificationDtos;
    }
}
