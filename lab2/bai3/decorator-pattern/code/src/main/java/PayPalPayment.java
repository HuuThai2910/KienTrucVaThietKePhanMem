/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán $" + amount + " bằng PayPal.");
    }
}
