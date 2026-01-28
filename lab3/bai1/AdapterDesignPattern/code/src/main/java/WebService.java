/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

/*
 * @description
 * @author: Huu Thai
 * @date:
 * @version: 1.0
 */
// 4. Client: Web Service hiện đại
public class WebService {
    public static void main(String[] args) {
        // Giả sử Web Service có một chuỗi JSON input
        String jsonInput = "{ \"username\": \"admin\", \"password\": \"123456\" }";

        // Hệ thống cũ có sẵn
        XmlLegacySystem oldSystem = new XmlLegacySystem();

        // Web Service không thể gọi trực tiếp oldSystem.receiveXmlData()
        // vì nó đang cầm JSON. Do đó, cần dùng Adapter.
        IJsonService adapter = new XmlToJsonAdapter(oldSystem);

        System.out.println("--- Bắt đầu gửi yêu cầu ---");

        // Web Service giao tiếp thông qua Interface chuẩn (IJsonService)
        // Nó không cần biết bên dưới đang chạy XML
        adapter.sendRequest(jsonInput);
    }
}
