/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package singleton;

/*
 * @description
 * @author: Huu Thai
 * @date:
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        // User 1 đặt hàng
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.query("SELECT * FROM products");

        // User 2 xem giỏ hàng
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.query("SELECT * FROM cart");

        // Kiểm tra: db1 và db2 là cùng một đối tượng
        System.out.println(db1 == db2); // true
    }
}
