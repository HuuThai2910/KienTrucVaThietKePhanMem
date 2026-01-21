package nosingleton;/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

/*
 * @description
 * @author: Huu Thai
 * @date:
 * @version: 1.0
 */
// Client sử dụng
public class Main {
    public static void main(String[] args) {
        // User 1 đặt hàng
        DatabaseConnection db1 = new DatabaseConnection();
        db1.query("SELECT * FROM products");

        // User 2 xem giỏ hàng
        DatabaseConnection db2 = new DatabaseConnection();
        db2.query("SELECT * FROM cart");
    }
}
