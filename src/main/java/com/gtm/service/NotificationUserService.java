package com.gtm.service;

import com.gtm.pojo.NotificationUser;

import java.util.List;

public interface NotificationUserService {
    public List<NotificationUser> getNotificationUser(int userId);
    public void turnOffNotification(int notificationUserId);
}
