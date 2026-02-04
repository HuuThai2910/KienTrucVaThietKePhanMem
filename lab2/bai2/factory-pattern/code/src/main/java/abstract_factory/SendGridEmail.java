/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package abstract_factory;

// --- Họ VIP ---
class SendGridEmail implements Email {
    public void sendEmail(String msg) {
        System.out.println("⭐️ VIP SendGrid: " + msg);
    }
}
