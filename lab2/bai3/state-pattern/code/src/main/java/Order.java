/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

// 3. Context (Đơn hàng)
class Order {
    private OrderState state;

    public Order() {
        this.state = new NewState(); // Trạng thái mặc định
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        // Ủy quyền hành vi cho trạng thái hiện tại
        state.handleRequest();
    }
}
