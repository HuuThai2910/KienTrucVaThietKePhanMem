/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package method_factory;

// 3. FACTORY CLASS (Nhà máy sản xuất)
class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null) return null;
        switch (type) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}
