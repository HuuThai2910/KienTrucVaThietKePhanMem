/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

// 2. Concrete Strategies (Các thuật toán tính thuế)
class VatTax implements TaxStrategy {
    @Override
    public double calculateTax(double price) {
        // Giả sử VAT là 10%
        return price * 0.10;
    }
}
