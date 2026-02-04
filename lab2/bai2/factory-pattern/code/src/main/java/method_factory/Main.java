/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package method_factory;

// 4. Client sử dụng
public class Main {
    public static void main(String[] args) {
        // Client không cần dùng từ khóa "new EmailNotification()"
        Notification notification = NotificationFactory.createNotification("SMS");
        notification.send("OTP của bạn là 1234");
    }
}
