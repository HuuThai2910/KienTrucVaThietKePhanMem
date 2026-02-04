/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package iuh.fit.edu.code.technical;

import iuh.fit.edu.code.common.FakeDatabase;
import iuh.fit.edu.code.common.SimplePasswordEncoder;
import org.springframework.stereotype.Service;

/*
 * @description
 * @author: Huu Thai
 * @date:
 * @version: 1.0
 */
@Service
public class TechnicalService {
    private final FakeDatabase db;
    private final SimplePasswordEncoder encoder;

    public TechnicalService(FakeDatabase db, SimplePasswordEncoder encoder) {
        this.db = db;
        this.encoder = encoder;
    }

    public void register(String email, String rawPass) {
        System.out.println("   [Technical-Pkg]: Service đang check pass...");
        // Logic nghiệp vụ bị rò rỉ ra Service
        if (rawPass.length() < 6) throw new RuntimeException("Pass yếu");

        TechnicalUser user = new TechnicalUser();
        // Service can thiệp trực tiếp vào dữ liệu của User
        user.email = email;
        user.password = encoder.encode(rawPass);

        db.technicalTable.put(email, user);
        System.out.println("   [Technical-Pkg]: Đã lưu.");
    }

    public void login(String email, String rawPass) {
        TechnicalUser user = (TechnicalUser) db.technicalTable.get(email);
        System.out.println("   [Technical-Pkg]: Service lấy pass của user ra so sánh.");
        // Logic bảo mật nằm ở Service
        if (!encoder.matches(rawPass, user.password)) throw new RuntimeException("Sai pass");
        System.out.println("   [Technical-Pkg]: Login OK.");
    }
}
