package src.ch18_Mediator.chatRoom;

import lombok.Getter;
import lombok.Setter;

/**
 * 定義可以發送訊息的物件介面(Colleague)
 */

@Getter
@Setter
public abstract class Messenger {
    private String name;
    public static Mediator mediator = new MessageMediator();

    public Messenger(String name) {
        this.name = name;
    }

    //發訊息給某人
    public void send(String message, Messenger to) {
        mediator.send(message, this.name, to);
    }

    //發訊息給每個人
    public void sendToAll(String message) {
        mediator.sendToAll(this.name, message);
    }
}
