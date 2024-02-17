package src.ch18_Mediator.chatRoom;

/**
 *中介者介面(Mediator)
 */
public interface Mediator {

    /**
     * 發訊息給某人
     * @param message
     * @param from
     * @param to
     */
    void send(String message, String from, Messenger to);

    /**
     * 發訊息給每個人
     * @param from
     * @param message
     */
    void sendToAll(String from, String message);
}
