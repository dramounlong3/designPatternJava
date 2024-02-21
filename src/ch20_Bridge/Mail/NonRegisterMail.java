package src.ch20_Bridge.Mail;
/**
 * 非掛號信
 */
public class NonRegisterMail extends Mail{
    @Override
    void registerState() {
        System.out.println("這是封非掛號信, 收件人不用簽名");
    }
}
