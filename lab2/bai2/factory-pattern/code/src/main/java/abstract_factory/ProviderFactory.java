/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package abstract_factory;

// 3. ABSTRACT FACTORY (Quy định 1 nhà máy phải sản xuất đủ bộ: Email + SMS)
interface ProviderFactory {
    Email createEmail();

    SMS createSMS();
}
