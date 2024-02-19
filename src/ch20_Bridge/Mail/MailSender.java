package src.ch20_Bridge.Mail;

/**
 * 寄信
 */
public abstract class MailSender {
    protected Mail mail;
    public MailSender(Mail mail) {
        this.mail = mail;
    }

    public abstract void send();
}
