/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void pay(double amount) {
        double discount = 10.0; // Giảm giá
        System.out.println(">> Đã áp dụng mã giảm giá: -$" + discount);
        super.pay(amount - discount);
    }
}
