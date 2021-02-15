package org.stepik.javaBasic.mailServise;

public class Inspector implements MailService{
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail.getClass() == MailPackage.class){
            Package pac = ((MailPackage) mail).getContent();
            String content = pac.getContent();

            if (content.indexOf("stones instead of ") == 0){
                throw new StolenPackageException();
            } else if (content.equals(WEAPONS) || content.equals(BANNED_SUBSTANCE)){
                throw new IllegalPackageException();
            }
        }
        return mail;
    }
}
