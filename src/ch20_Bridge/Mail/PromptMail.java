package src.ch20_Bridge.Mail;

/**
 * 主要以信件送達的時間區隔
 * 限時信
 */
public class PromptMail extends MailSender{
    public PromptMail(Mail mail) {
        super(mail);
    }

    /**
     * 寄信
     */
    @Override
    public void send() {
        System.out.print(">> 限時信件寄出後1天內送達  ");

        //根據實作PromptMail時, 具體放入的建構子的mail參數類型, 決定會呼叫 掛號(RegisterMail) 或 非掛號(NonRegisterMAIL) 的 registerState
        super.mail.registerState();
    }
}
