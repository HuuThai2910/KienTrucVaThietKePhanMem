/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */

public interface Subject {
    void attach(Observer o);   // Đăng ký theo dõi
    void detach(Observer o);   // Hủy đăng ký
    void notifyObservers();    // Gửi thông báo
}
