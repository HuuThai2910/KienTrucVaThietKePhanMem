/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package factory;

class VNPayPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Đang chuyển hướng sang cổng VNPAY...");
    }
}
