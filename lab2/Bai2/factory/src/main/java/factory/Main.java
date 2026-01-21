/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package factory;

// 4. Client (Nơi sử dụng)
public class Main {
    public static void main(String[] args) {
        // Giả sử dữ liệu này được gửi từ Frontend xuống
        String userChoice1 = "MOMO";
        String userChoice2 = "COD";

        System.out.println("--- Đơn hàng 1 ---");
        // Client không cần dùng từ khóa "new MomoPayment()" trực tiếp
        Payment payment1 = PaymentFactory.createPayment(userChoice1);
        payment1.pay();

        System.out.println("\n--- Đơn hàng 2 ---");
        Payment payment2 = PaymentFactory.createPayment(userChoice2);
        payment2.pay();

        // Thử trường hợp lỗi
        // Payment payment3 = PaymentFactory.createPayment("BITCOIN"); // Sẽ ném lỗi
    }
}
