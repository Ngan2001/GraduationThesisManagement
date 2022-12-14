package com.gtm.service.implement;

import com.gtm.pojo.NotificationUser;
import com.gtm.repository.NotificationUserRepository;
import com.gtm.service.NotificationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationUserServiceImplement implements NotificationUserService {
    @Autowired
    private NotificationUserRepository notificationUserRepository;

    @Override
    public List<NotificationUser> getNotificationUser(int userId) {
        return this.notificationUserRepository.getNotificationUser(userId);
    }

    @Override
    public void turnOffNotification(int notificationUserId) {
        this.notificationUserRepository.turnOffNotification(notificationUserId);
    }
}
