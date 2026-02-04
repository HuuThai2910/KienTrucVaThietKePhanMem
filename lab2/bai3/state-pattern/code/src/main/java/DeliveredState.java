/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

class DeliveredState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Status: ĐÃ GIAO -> Cập nhật thành công vào lịch sử mua hàng.");
    }
}
