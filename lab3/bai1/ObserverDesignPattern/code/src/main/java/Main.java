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
public class Main {
    public static void main(String[] args) {
        // --- KỊCH BẢN 1: THỊ TRƯỜNG CHỨNG KHOÁN ---
        System.out.println("=== KỊCH BẢN 1: CHỨNG KHOÁN ===");
        Stock appleStock = new Stock("AAPL", 150.0);

        Investor warren = new Investor("Warren Buffet");
        Investor elon = new Investor("Elon Musk");

        // Các nhà đầu tư đăng ký theo dõi mã AAPL
        appleStock.attach(warren);
        appleStock.attach(elon);

        // Giá thay đổi -> Tự động bắn thông báo
        appleStock.setPrice(155.5);

        System.out.println("\n--- Elon Musk hủy theo dõi ---");
        appleStock.detach(elon);
        appleStock.setPrice(160.0); // Chỉ Warren nhận được tin


        // --- KỊCH BẢN 2: DỰ ÁN PHẦN MỀM ---
        System.out.println("\n\n=== KỊCH BẢN 2: DỰ ÁN PHẦN MỀM ===");
        Task backendTask = new Task("Thiết kế Database", "In Progress");

        TeamMember devA = new TeamMember("An");
        TeamMember devB = new TeamMember("Bình");
        TeamMember manager = new TeamMember("Sếp");

        // Team đăng ký nhận tin về task này
        backendTask.attach(devA);
        backendTask.attach(devB);
        backendTask.attach(manager);

        // Trạng thái task thay đổi -> Cả team nhận tin
        backendTask.setStatus("Completed");
    }
}
