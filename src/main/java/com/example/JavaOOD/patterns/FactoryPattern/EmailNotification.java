package com.example.JavaOOD.patterns.FactoryPattern;

public class EmailNotification implements iNotification {
    @Override
    public void notifyUser() {
        System.out.println("This is an EMAIL Notification.");
    }
}
