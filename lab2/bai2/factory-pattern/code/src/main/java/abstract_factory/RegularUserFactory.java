/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package abstract_factory;

// 4. Concrete Factories (Nhà máy cụ thể)
class RegularUserFactory implements ProviderFactory {
    public Email createEmail() {
        return new Gmail();
    }

    public SMS createSMS() {
        return new BasicSMS();
    }
}
