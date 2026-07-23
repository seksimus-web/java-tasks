package com.seksimus.basicjava.module4.task5;

import java.util.logging.Logger;

public class Spy implements MailService {

    private final Logger logger;

    public Spy(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            MailMessage message = (MailMessage) mail;
            if ("Austin Powers".equals(message.getFrom())
                    || "Austin Powers".equals(message.getTo())) {
                logger.warning("Detected target mail correspondence: from "
                        + message.getFrom()
                        + " to "
                        + message.getTo()
                        + " \""
                        + message.getMessage()
                        + "\""
                );
            } else {
                logger.info("Usual correspondence: from "
                        + message.getFrom()
                        + " to "
                        + message.getTo()
                );
            }
        }
        return mail;
    }
}
