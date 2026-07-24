package com.seksimus.basicjava.module4.task5;

public class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {

        if (mail instanceof MailPackage) {

            MailPackage mailPackage = (MailPackage) mail;

            Package content = mailPackage.getContent();

            String packageContent = content.getContent();

            if (packageContent.contains("stones instead of")) {
                throw new StolenPackageException();
            }

            if (packageContent.contains("weapons")
                    || packageContent.contains("banned substance")) {
                throw new IllegalPackageException();
            }
        }

        return mail;
    }
}

