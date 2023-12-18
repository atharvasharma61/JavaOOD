package com.example.JavaOOD.patterns.FactoryPattern;

public class SMSNotification implements iNotification {
    @Override
    public void notifyUser() {
        System.out.println("This is an SMS Notification.");
    }
}
