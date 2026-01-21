/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package nofactory;

// 3. Main chạy thử
public class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        System.out.println("--- Đơn hàng 1 ---");
        service.processPayment("MOMO");

        System.out.println("\n--- Đơn hàng 2 ---");
        service.processPayment("VNPAY");
    }
}
