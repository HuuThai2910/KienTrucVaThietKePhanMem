# Sử dụng Image Postgres gốc làm nền tảng
FROM postgres:15

# Đặt các biến môi trường mặc định (bạn có thể ghi đè chúng khi chạy container)
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=mysecretpassword
ENV POSTGRES_DB=ecommerce_db

# Copy file init.sql từ máy của bạn vào thư mục tự động chạy của Postgres bên trong Image
COPY init.sql /docker-entrypoint-initdb.d/

# Lưu ý: Không cần lệnh CMD hay ENTRYPOINT, vì chúng ta kế thừa luồng chạy mặc định của Image gốc