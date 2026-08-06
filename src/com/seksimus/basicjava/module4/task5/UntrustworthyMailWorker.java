package com.seksimus.basicjava.module4.task5;

public class UntrustworthyMailWorker implements MailService {

    private final MailService[] mailServices;
    private final RealMailService realMailService;

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
        this.realMailService = new RealMailService();
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {

        Sendable processedMail = mail;

        for (MailService mailService : mailServices) {
            processedMail = mailService.processMail(processedMail);
        }

        return realMailService.processMail(processedMail);
    }
}