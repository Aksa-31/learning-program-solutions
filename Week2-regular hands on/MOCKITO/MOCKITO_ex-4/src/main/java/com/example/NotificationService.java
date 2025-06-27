package com.example;

public class NotificationService {
    private final Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notifyUser() {
        notifier.sendNotification("Hello user!");
    }
}
