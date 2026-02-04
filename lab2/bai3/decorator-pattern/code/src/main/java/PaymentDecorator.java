/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

// 3. Abstract Decorator
abstract class PaymentDecorator implements Payment {
    protected Payment wrappedPayment;

    public PaymentDecorator(Payment payment) {
        this.wrappedPayment = payment;
    }

    public void pay(double amount) {
        wrappedPayment.pay(amount);
    }
}
