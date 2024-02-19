package src.ch20_Bridge.Mail;

/**
 * 主要以信件送達時間區分
 * 一般信件
 */
public class NormalMail extends MailSender{

    public NormalMail(Mail mail) {
        super(mail);
    }

    /**
     * 寄信
     */
    @Override
    public void send() {
        System.out.print(">>一般信件寄出後 3~5天送達  ");

        //根據實作NormalMail時, 具體放入建構子的mail參數類型, 決定會呼叫 掛號(RegisterMail) 或 非掛號(NonRegisterMAIL) 的 registerState
        super.mail.registerState();
    }
}
