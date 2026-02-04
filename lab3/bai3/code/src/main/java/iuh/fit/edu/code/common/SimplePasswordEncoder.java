/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package iuh.fit.edu.code.common;

import org.springframework.stereotype.Component;

/*
 * @description
 * @author: Huu Thai
 * @date:
 * @version: 1.0
 */
@Component
public class SimplePasswordEncoder {
    public String encode(String raw) { return "HASH_" + raw; }
    public boolean matches(String raw, String encoded) { return encoded.equals("HASH_" + raw); }
}
