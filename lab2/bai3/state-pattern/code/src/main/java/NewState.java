/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

// 2. Concrete States
class NewState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Status: MỚI TẠO -> Đang kiểm tra thông tin đơn hàng...");
    }
}
