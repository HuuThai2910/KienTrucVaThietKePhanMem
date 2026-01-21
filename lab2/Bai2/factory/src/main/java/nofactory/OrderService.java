/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package nofactory;

// 2. Class xử lý đơn hàng (Client)
// VẤN ĐỀ NẰM Ở ĐÂY: Class này "biết quá nhiều"
class OrderService {
    public void processPayment(String type) {
        // Logic chọn và khởi tạo nằm CHẾT CỨNG (Hard-coded) ngay trong logic nghiệp vụ
        if (type.equalsIgnoreCase("MOMO")) {
            MomoPayment momo = new MomoPayment();// Phụ thuộc trực tiếp vào class con
            momo.pay();
        } else if (type.equalsIgnoreCase("VNPAY")) {
            VNPayPayment vnpay = new VNPayPayment(); // Phụ thuộc trực tiếp
            vnpay.pay();
        } else if (type.equalsIgnoreCase("COD")) {
            CODPayment cod = new CODPayment(); // Phụ thuộc trực tiếp
            cod.pay();
        } else {
            System.out.println("Phương thức không hỗ trợ!");
        }
    }
}
