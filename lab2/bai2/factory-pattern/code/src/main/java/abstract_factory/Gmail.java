/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package abstract_factory;

// 2. Concrete Products (Sản phẩm cụ thể cho từng họ)
// --- Họ Regular ---
class Gmail implements Email {
    public void sendEmail(String msg) {
        System.out.println("Free Gmail: " + msg);
    }
}
