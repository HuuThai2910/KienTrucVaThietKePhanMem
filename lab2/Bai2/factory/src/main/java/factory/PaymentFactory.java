/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package factory;

// 3. Factory Class: "Nhà máy" chuyên tạo đối tượng
class PaymentFactory {
    // Phương thức này trả về Interface Payment, không phải class cụ thể
    public static Payment createPayment(String type) {
        if (type == null) {
            return null;
        }

        // Logic chọn đối tượng nằm gói gọn tại đây
        switch (type.toUpperCase()) {
            case "MOMO":
                return new MomoPayment();
            case "VNPAY":
                return new VNPayPayment();
            case "COD":
                return new CODPayment();
            default:
                throw new IllegalArgumentException("Phương thức thanh toán không hỗ trợ: " + type);
        }
    }
}
