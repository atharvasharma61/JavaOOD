package com.example.JavaOOD.patterns.FactoryPattern;

public class PushNotification implements iNotification {
    @Override
    public void notifyUser() {
        System.out.println("This is a PUSH Notification.");
    }
}
