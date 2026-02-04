/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package method_factory;

class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("📱 Gửi SMS: " + message);
    }
}
