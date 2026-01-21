/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package factory;

// 2. Các class cụ thể (Concrete Classes) thực thi Interface
class MomoPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Đang xử lý thanh toán qua ví MOMO...");
    }
}
