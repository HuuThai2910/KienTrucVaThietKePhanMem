/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package iuh.fit.edu.code.domain;

import iuh.fit.edu.code.common.SimplePasswordEncoder;

/*
 * @description
 * @author: Huu Thai
 * @date:
 * @version: 1.0
 */
public class DomainUser {
    private String email;
    private String password;

    // Logic khởi tạo nằm đúng chỗ
    public DomainUser(String email, String rawPass, SimplePasswordEncoder encoder) {
        System.out.println("      >> [Domain-Entity]: Tự check pass...");
        if (rawPass.length() < 6) throw new RuntimeException("Pass yếu");

        this.email = email;
        System.out.println("      >> [Domain-Entity]: Tự mã hóa...");
        this.password = encoder.encode(rawPass);
    }

    // Logic nghiệp vụ nằm đúng chỗ
    public boolean checkLogin(String rawPass, SimplePasswordEncoder encoder) {
        System.out.println("      >> [Domain-Entity]: Tự so sánh pass...");
        return encoder.matches(rawPass, this.password);
    }
}
