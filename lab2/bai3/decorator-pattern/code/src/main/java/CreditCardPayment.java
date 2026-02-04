/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

// 2. Concrete Component (Phương thức thanh toán cơ bản)
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán $" + amount + " bằng Thẻ Tín Dụng.");
    }
}
