/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package abstract_factory;

class BasicSMS implements SMS {
    public void sendSMS(String msg) {
        System.out.println("Sim rác SMS: " + msg);
    }
}
