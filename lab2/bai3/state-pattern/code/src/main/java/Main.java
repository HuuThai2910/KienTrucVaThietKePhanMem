// 4. Chạy thử
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        
        order.processOrder(); // Output: Kiểm tra thông tin...

        // Chuyển trạng thái
        order.setState(new ProcessingState());
        order.processOrder(); // Output: Đóng gói...

        order.setState(new CancelledState());
        order.processOrder(); // Output: Hoàn tiền...
    }
}