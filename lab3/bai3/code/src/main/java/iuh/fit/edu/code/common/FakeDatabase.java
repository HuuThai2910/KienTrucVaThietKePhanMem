/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package iuh.fit.edu.code.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/*
 * @description
 * @author: Huu Thai
 * @date:
 * @version: 1.0
 */
@Component
public class FakeDatabase {
    public Map<String, Object> technicalTable = new HashMap<>();
    public Map<String, Object> domainTable = new HashMap<>();
}
