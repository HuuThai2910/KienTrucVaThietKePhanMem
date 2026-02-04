/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

class ProcessingState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Status: ĐANG XỬ LÝ -> Đang đóng gói và vận chuyển...");
    }
}
