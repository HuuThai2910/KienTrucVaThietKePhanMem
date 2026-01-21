/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package factory;

class CODPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Đã ghi nhận: Thanh toán tiền mặt khi nhận hàng (COD).");
    }
}
