package src.ch20_Bridge;

import org.junit.jupiter.api.Test;
import src.ch20_Bridge.Mail.*;

public class MailTest {

    @Test
    public void test() {
        //先決定要寄什麼信MailSender(時間) ==> NormalMail/PromptMail, 再決定是否要掛號Mail(種類) RegisterState/NonRegisterState
        System.out.println("==========橋樑模式測試==========");
        //將各種類別的信件及種類實體先建立
        //平信
        MailSender normalMailNonRegister = new NormalMail(new NonRegisterMail());   //平信 - 非掛號
        MailSender normalMailRegister = new NormalMail(new RegisterMail());         //平信 - 掛號
        //限時信
        MailSender promptMailNonRegister = new PromptMail(new NonRegisterMail());   //限時信 - 非掛號
        MailSender promptMailRegister = new PromptMail(new RegisterMail());         //限時信 - 掛號

        //開始寄信
        normalMailNonRegister.send();
        normalMailRegister.send();
        promptMailNonRegister.send();
        promptMailRegister.send();


    }
}
