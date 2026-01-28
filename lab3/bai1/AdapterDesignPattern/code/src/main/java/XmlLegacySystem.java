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
// 2. Adaptee: Hệ thống cũ, chỉ hiểu XML, không tương thích với Web Service
class XmlLegacySystem {
    public void receiveXmlData(String xmlData) {
        System.out.println("Legacy System đang xử lý dữ liệu XML:");
        System.out.println(xmlData);
        System.out.println("=> Xử lý thành công!");
    }
}
