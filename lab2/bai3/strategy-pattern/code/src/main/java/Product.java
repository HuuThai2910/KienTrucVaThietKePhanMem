/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

// 3. Context (Sản phẩm)
class Product {
    private String name;
    private double price;
    private TaxStrategy taxStrategy;

    public Product(String name, double price, TaxStrategy taxStrategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public double getFinalPrice() {
        double tax = taxStrategy.calculateTax(price);
        return price + tax;
    }
}
