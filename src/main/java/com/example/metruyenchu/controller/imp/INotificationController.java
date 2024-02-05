package com.example.metruyenchu.controller.imp;

import com.example.metruyenchu.controller.GenericController;
import com.example.metruyenchu.dto.NotificationDto;
import com.example.metruyenchu.service.imp.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class INotificationController implements GenericController<NotificationDto> {

    private INotificationService notificationService;

    @Autowired
    public INotificationController(INotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    @PostMapping("/notifications/{userId}")
    public NotificationDto create(NotificationDto object) {
        return notificationService.saveData(object);
    }

    @Override
    @PostMapping("/notifications/{id}")
    public void delete(@PathVariable("id") Long id) {
        notificationService.delete(id);
    }

    @Override
    @PutMapping("/notifications/{id}")
    public NotificationDto update(NotificationDto object, @PathVariable("id") Long id) {
        object.setId(id);
        return notificationService.saveData(object);
    }

    @Override
    @GetMapping("/notifications")
    public List<NotificationDto> listObject() {
        return notificationService.recordOfList();
    }
}
