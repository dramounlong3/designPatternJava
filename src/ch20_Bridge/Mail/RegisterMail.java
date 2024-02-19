package src.ch20_Bridge.Mail;

/**
 * 掛號信
 */
public class RegisterMail extends Mail{
    @Override
    void registerState() {
        System.out.println("這是封掛號信, 收件人必須簽名");
    }
}
