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
public class DatabaseConnection {
    // 1. Biến static giữ instance duy nhất
    private static DatabaseConnection instance;

    // 2. Private constructor để ngăn chặn việc new ở bên ngoài
    private DatabaseConnection() {
        System.out.println("Dang khoi tao ket noi Database... (Chi chay 1 lan)");
    }

    // 3. Method static để lấy instance
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Thuc thi lenh: " + sql);
    }
}
