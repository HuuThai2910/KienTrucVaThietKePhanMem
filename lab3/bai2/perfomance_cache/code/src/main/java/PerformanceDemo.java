import java.util.HashMap;
import java.util.Map;

public class PerformanceDemo {
    // Giả lập Redis bằng HashMap (Lưu trên RAM)
    static Map<String, String> cacheRedis = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        String userId = "user_123";

        // Lần 1: Chưa có cache, phải chọc vào DB (Rất chậm)
        long start1 = System.currentTimeMillis();
        String data1 = getUserData(userId);
        long end1 = System.currentTimeMillis();
        System.out.println("Lần 1 (Đọc DB): " + data1 + " | Thời gian: " + (end1 - start1) + "ms");

        // Lần 2: Đã có cache, lấy từ RAM (Rất nhanh)
        long start2 = System.currentTimeMillis();
        String data2 = getUserData(userId);
        long end2 = System.currentTimeMillis();
        System.out.println("Lần 2 (Đọc Cache): " + data2 + " | Thời gian: " + (end2 - start2) + "ms");
    }

    public static String getUserData(String id) throws InterruptedException {
        // 1. Kiểm tra Cache trước
        if (cacheRedis.containsKey(id)) {
            return cacheRedis.get(id); // Có thì trả về ngay (Cache Hit)
        }

        // 2. Không có thì phải query DB (Giả lập độ trễ 2 giây)
        simulateSlowDatabaseQuery();
        String result = "User Name: Thanh";

        // 3. Lưu vào Cache cho lần sau
        cacheRedis.put(id, result);
        return result;
    }

    private static void simulateSlowDatabaseQuery() throws InterruptedException {
        Thread.sleep(2000); // Giả vờ DB đang xử lý lâu
    }
}