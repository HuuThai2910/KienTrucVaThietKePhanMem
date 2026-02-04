/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

class LuxuryTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        // Giả sử thuế xa xỉ là 20% + 5% phí môi trường
        return price * 0.25;
    }
}
