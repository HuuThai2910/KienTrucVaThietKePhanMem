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
// 3. Adapter: Chuyển đổi từ JSON sang XML
class XmlToJsonAdapter implements IJsonService {
    private XmlLegacySystem xmlSystem;

    // Adapter cần giữ tham chiếu đến đối tượng Adaptee
    public XmlToJsonAdapter(XmlLegacySystem xmlSystem) {
        this.xmlSystem = xmlSystem;
    }

    @Override
    public void sendRequest(String jsonData) {
        // A. Nhận dữ liệu JSON từ Client
        System.out.println("Adapter: Đã nhận JSON: " + jsonData);

        // B. Chuyển đổi (Translate) từ JSON sang XML
        String xmlData = convertJsonToXml(jsonData);
        System.out.println("Adapter: Đã chuyển đổi sang XML.");

        // C. Gọi phương thức của hệ thống cũ với dữ liệu đã chuyển đổi
        xmlSystem.receiveXmlData(xmlData);
    }

    // Hàm giả lập logic chuyển đổi định dạng
    private String convertJsonToXml(String json) {
        // Trong thực tế, bạn sẽ dùng thư viện như Jackson hoặc Gson để parse
        // Ở đây tôi mô phỏng bằng cách thay thế chuỗi đơn giản
        String xml = json.replace("{", "<root>")
                .replace("}", "</root>")
                .replace("\"", "")
                .replace(":", ">")
                .replace(",", "</item><item>");
        // Giả sử kết quả trả về là một chuỗi XML hợp lệ
        return "<xml>" + xml + "</xml>";
    }
}
