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
public class DatabaseConnection {
    public DatabaseConnection() {
        // Giả lập việc kết nối tốn 2 giây
        System.out.println("Dang khoi tao ket noi Database... (Ton 2s)");
    }
    public void query(String sql) {
        System.out.println("Thuc thi lenh: " + sql);
    }
}
