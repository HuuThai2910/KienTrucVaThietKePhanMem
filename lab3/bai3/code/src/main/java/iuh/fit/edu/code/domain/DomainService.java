/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package iuh.fit.edu.code.domain;

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
public class DomainService {
    private final FakeDatabase db;
    private final SimplePasswordEncoder encoder;

    public DomainService(FakeDatabase db, SimplePasswordEncoder encoder) {
        this.db = db;
        this.encoder = encoder;
    }

    public void register(String email, String rawPass) {
        System.out.println("   [Domain-Pkg]: Gọi new User().");
        // Service rất gọn, chỉ ủy quyền
        DomainUser user = new DomainUser(email, rawPass, encoder);

        db.domainTable.put(email, user);
        System.out.println("   [Domain-Pkg]: Đã lưu.");
    }

    public void login(String email, String rawPass) {
        DomainUser user = (DomainUser) db.domainTable.get(email);

        System.out.println("   [Domain-Pkg]: Hỏi User pass đúng không?");
        if (!user.checkLogin(rawPass, encoder)) throw new RuntimeException("Sai pass");
        System.out.println("   [Domain-Pkg]: Login OK.");
    }
}