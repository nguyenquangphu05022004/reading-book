package com.example.metruyenchu.dto;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Builder
public class NotificationDto {
    private Long id;

    private String message;

    private UserDto userDto;

    private BookDto bookDto;


    private boolean hasNotificated;

    private boolean sawNotification;

}
