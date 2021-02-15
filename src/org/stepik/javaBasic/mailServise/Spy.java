package org.stepik.javaBasic.mailServise;

import java.util.logging.Logger;

public class Spy implements MailService{
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";
    private Logger LOGGER;

    public Spy( Logger logger){
        LOGGER = logger;
    }



    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailMessage.class){
            MailMessage mailMessage = (MailMessage) mail;
            String from = mailMessage.from;
            String to = mailMessage.to;

            if (from.equals(AUSTIN_POWERS) || to.equals(AUSTIN_POWERS)){
                LOGGER.warning("Detected target mail correspondence: " +
                        "from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");
            } else {
                LOGGER.info("Usual correspondence: from " + from + " to " + to + "");
            }
        }
        return mail;
    }
}
