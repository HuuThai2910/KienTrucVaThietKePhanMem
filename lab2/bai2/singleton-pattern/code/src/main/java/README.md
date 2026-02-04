# Design Pattern Demo: Singleton
### 🚩 Bài toán: Quản lý kết nối Database
Việc khởi tạo kết nối đến Cơ sở dữ liệu (`DatabaseConnection`) tốn nhiều tài nguyên và thời gian.

#### ❌ Trường hợp KHÔNG áp dụng (Bad Practice)
Mỗi khi cần query dữ liệu, chúng ta lại khởi tạo mới một đối tượng kết nối.

* **Cách làm:** `DatabaseConnection db = new DatabaseConnection();`
* **Hậu quả:**
    * **Lãng phí tài nguyên:** CPU và RAM tăng vọt do tạo quá nhiều đối tượng dư thừa.
    * **Quá tải hệ thống:** Dễ gặp lỗi "Too many connections" khiến Database bị sập.
    * **Mất kiểm soát:** Không quản lý được trạng thái chung của dữ liệu.

#### ✅ Trường hợp CÓ áp dụng (Best Practice)
Chỉ khởi tạo kết nối một lần duy nhất và tái sử dụng nó.

* **Cách làm:** `DatabaseConnection db = DatabaseConnection.getInstance();`
* **Lợi ích:**
    * **Hiệu năng cao:** Tiết kiệm tài nguyên hệ thống.
    * **An toàn:** Kiểm soát được số lượng kết nối tới Database.