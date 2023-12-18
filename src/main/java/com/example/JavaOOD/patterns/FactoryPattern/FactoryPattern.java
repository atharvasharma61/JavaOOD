package com.example.JavaOOD.patterns.FactoryPattern;

import com.example.JavaOOD.patterns.iPattern;
public class FactoryPattern implements iPattern {
    @Override
    public void run() {
        iFactory notificationFactory = new NotificationFactory();
        iNotification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();

        notification = notificationFactory.createNotification("EMAIL");
        notification.notifyUser();
    }
}
