/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package abstract_factory;

class BrandnameSMS implements SMS {
    public void sendSMS(String msg) {
        System.out.println("⭐️ VIP Brandname: " + msg);
    }
}
