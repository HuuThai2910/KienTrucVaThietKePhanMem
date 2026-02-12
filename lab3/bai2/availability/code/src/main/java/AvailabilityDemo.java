import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AvailabilityDemo {

    // Giả lập danh sách Server IP
    static List<String> servers = Arrays.asList("Server-1 (192.168.1.10)", "Server-2 (192.168.1.11)");

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            String liveServer = getHealthyServer();
            if (liveServer != null) {
                System.out.println("Request " + (i + 1) + " được xử lý bởi: " + liveServer);
            } else {
                System.out.println("HỆ THỐNG SẬP: Không có server nào hoạt động!");
            }
        }
    }

    // Hàm này đóng vai trò Health Check & Routing
    public static String getHealthyServer() {
        for (String server : servers) {
            if (ping(server)) { // HEALTH CHECK
                return server; // Nếu server này sống, trả về ngay
            }
            System.out.println("⚠️ Cảnh báo: " + server + " không phản hồi (Dead). Đang chuyển hướng...");
        }
        return null;
    }

    // Giả lập lệnh Ping: Server 1 luôn chết, Server 2 luôn sống
    public static boolean ping(String ip) {
        if (ip.contains("Server-1")) return false; // Giả sử server 1 bị sập nguồn
        return true; // Server 2 vẫn sống
    }
}