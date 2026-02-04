/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package method_factory;

// 2. Các class cụ thể (Concrete Product)
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("📧 Gửi Email: " + message);
    }
}
