import java.util.Random;

public class FaultToleranceDemo {

    public static void main(String[] args) {
        System.out.println("Bắt đầu gửi request thanh toán...");
        boolean success = callServiceWithRetry(3); // Thử tối đa 3 lần
        
        if (success) {
            System.out.println("✅ Giao dịch thành công!");
        } else {
            System.out.println("❌ Giao dịch thất bại sau nhiều lần thử. Vui lòng thử lại sau.");
        }
    }

    // Logic bọc (Wrapper) để xử lý lỗi
    public static boolean callServiceWithRetry(int maxRetries) {
        for (int i = 1; i <= maxRetries; i++) {
            try {
                unstableNetworkService(); // Gọi hàm hay bị lỗi
                return true; // Nếu thành công thì thoát luôn
            } catch (RuntimeException e) {
                System.out.println("⚠️ Lần thử " + i + " thất bại: " + e.getMessage());
                // Chờ 1 chút rồi thử lại (Backoff)
                try { Thread.sleep(500); } catch (InterruptedException ex) {}
            }
        }
        return false; // Hết số lần thử mà vẫn lỗi
    }

    // Giả lập một service mạng chập chờn (lúc được lúc không)
    public static void unstableNetworkService() {
        Random rand = new Random();
        int r = rand.nextInt(10);
        // 70% là sẽ bị đứt mạng (lỗi)
        if (r < 7) {
            throw new RuntimeException("Connection Time out!");
        }
        System.out.println("-> Kết nối Server thành công.");
    }
}