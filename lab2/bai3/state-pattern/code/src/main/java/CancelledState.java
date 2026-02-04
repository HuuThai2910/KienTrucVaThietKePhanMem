/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

class CancelledState implements OrderState {
    @Override
    public void handleRequest() {
        System.out.println("Status: HỦY -> Đang tiến hành hoàn tiền.");
    }
}
