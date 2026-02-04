/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

// 4. Concrete Decorators (Các tính năng bổ sung)
class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        double fee = 5.0; // Phí cố định
        System.out.println(">> Đã cộng thêm phí xử lý: $" + fee);
        super.pay(amount + fee); // Gọi hàm gốc với số tiền mới
    }
}
