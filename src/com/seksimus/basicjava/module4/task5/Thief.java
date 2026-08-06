package com.seksimus.basicjava.module4.task5;

public class Thief implements MailService {

    private int stolenValue;
    private final int minValue;

    public Thief(int minValue) {
        this.minValue = minValue;
    }

    public int getStolenValue() {
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {

        if (mail instanceof MailPackage) {
            MailPackage mailPackage = (MailPackage) mail;

            Package content = mailPackage.getContent();

            if (content.getPrice() >= minValue) {

                stolenValue += content.getPrice();

                Package stolenPackage = new Package(
                        "stones instead of " + content.getContent(),
                        0
                );

                return new MailPackage(
                        mailPackage.getFrom(),
                        mailPackage.getTo(),
                        stolenPackage
                );
            }
        }

        return mail;
    }
}
