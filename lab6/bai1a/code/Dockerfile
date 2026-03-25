# ==========================================
# STAGE 1: BUILDER (Môi trường chuẩn bị)
# ==========================================
FROM node:18-alpine AS builder
WORKDIR /app

# Tối ưu Cache (Save Data): Chỉ copy package.json trước
COPY package*.json ./

# Cài đặt TOÀN BỘ thư viện (Bao gồm cả thư viện hỗ trợ dev/build)
RUN npm install

# Copy toàn bộ source code vào
COPY . .

# Nếu dự án của bạn dùng TypeScript hoặc React, bạn sẽ chạy lệnh build ở đây:
# RUN npm run build

# ==========================================
# STAGE 2: RUNNER (Môi trường chạy thực tế)
# ==========================================
FROM node:18-alpine AS runner
WORKDIR /app

# Thiết lập môi trường Production để Node.js chạy mượt và bảo mật hơn
ENV NODE_ENV=production

# Tối ưu dung lượng: Chỉ copy lại package.json
COPY package*.json ./

# CHỈ cài đặt các thư viện cần thiết để chạy (Bỏ qua devDependencies)
RUN npm install --omit=dev

# "Bốc" file code từ Stage 1 sang Stage 2
# Nếu dùng TypeScript/React, bạn sẽ copy thư mục /dist hoặc /build
COPY --from=builder /app/index.js ./

# Mở cổng 3000
EXPOSE 3000

# Khởi động ứng dụng
CMD ["node", "index.js"]