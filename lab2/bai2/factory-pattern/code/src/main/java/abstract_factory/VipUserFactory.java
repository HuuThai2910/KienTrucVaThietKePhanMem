/*
 * @ (#) .java    1.0
 * Copyright (c)  IUH. All rights reserved.
 */
package abstract_factory;

class VipUserFactory implements ProviderFactory {
    public Email createEmail() {
        return new SendGridEmail();
    }

    public SMS createSMS() {
        return new BrandnameSMS();
    }
}
