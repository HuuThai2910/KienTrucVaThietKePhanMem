package nofactory;

// Class xử lý gửi logic
public class NotificationService {
    public void sendNotification(String type, String message) {
        if (type.equals("EMAIL")) {
            // Logic tạo và gửi Email dính chặt ở đây
            System.out.println("Đang kết nối SMTP Server...");
            System.out.println("Gửi Email: " + message);
        } 
        else if (type.equals("SMS")) {
            // Logic gửi SMS dính chặt ở đây
            System.out.println("Đang kết nối nhà mạng Viettel...");
            System.out.println("Gửi SMS: " + message);
        } 
        else if (type.equals("PUSH")) {
            System.out.println("Gửi Push Notification: " + message);
        } 
        else {
            throw new IllegalArgumentException("Loại thông báo không hỗ trợ");
        }
    }
}

