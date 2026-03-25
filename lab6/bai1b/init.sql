-- Tạo bảng lưu trữ thông tin đơn hàng
CREATE TABLE orders (
    id SERIAL PRIMARY KEY,
    order_code VARCHAR(50) UNIQUE NOT NULL,
    total_amount DECIMAL(10, 2) NOT NULL,
    status VARCHAR(20) DEFAULT 'PENDING'
);

-- Chèn dữ liệu mẫu ban đầu
INSERT INTO orders (order_code, total_amount, status) VALUES
('ORD-001', 1500000.00, 'PAID'),
('ORD-002', 500000.00, 'CANCELLED'),
('ORD-003', 2500000.00, 'PENDING');