package src.ch20_Bridge.Mail;

/**
 * 信件
 */
public abstract class Mail {
    /**
     * 註冊信件的種類, 平信, 掛號信, 雙掛號信...等
     */
    abstract void registerState();
}
