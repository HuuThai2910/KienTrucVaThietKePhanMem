import java.util.HashMap;
import java.util.Map;

public class ScalabilityDemo {
    public static void main(String[] args) {
        // KỊCH BẢN:
        // Request 1: Đăng nhập vào Server A (Docker Container A)
        // Request 2: Load Balance điều hướng sang Server B (Docker Container B)
        
        System.out.println("--- DEMO STATELESS ARCHITECTURE ---");
        
        // Giả lập Token (Dữ liệu nằm ở Client/DB chung, không nằm ở RAM server)
        String userToken = "token_thanh_123"; 

        // Server B nhận request kèm token
        ServerB_Container containerB = new ServerB_Container();
        containerB.processRequest(userToken);
    }
}

class ServerB_Container {
    // Server này KHÔNG lưu trữ danh sách user đã login trong RAM (List<User> loggedInUsers)
    // Nó chỉ xác thực dựa trên Token gửi lên -> Đây là Stateless
    
    public void processRequest(String token) {
        if (isValidToken(token)) {
            System.out.println("✅ Server B: Xử lý thành công cho Token: " + token);
            System.out.println("=> Chứng minh: Server B không cần biết Server A đã làm gì, chỉ cần Token hợp lệ.");
            System.out.println("=> Kết luận: Có thể nhân bản 1000 Server B bằng Docker thoải mái.");
        } else {
            System.out.println("❌ Từ chối.");
        }
    }

    private boolean isValidToken(String token) {
        // Logic check token (JWT verify) không phụ thuộc vào RAM của server này
        return token.startsWith("token_");
    }
}