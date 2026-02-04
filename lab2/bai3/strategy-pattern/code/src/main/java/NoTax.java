/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

class NoTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        return 0;
    }
}
