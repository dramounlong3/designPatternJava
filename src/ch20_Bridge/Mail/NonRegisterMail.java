package src.ch20_Bridge.Mail;
/**
 * 平信
 */
public class NonRegisterMail extends Mail{
    @Override
    void registerState() {
        System.out.println("這是封平信, 收件人不用簽名");
    }
}
