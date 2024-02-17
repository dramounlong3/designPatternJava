package src.ch18_Mediator.chatRoom;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者類別(Concrete Mediator)
 */
public class MessageMediator implements Mediator {

    private static List<VIPUser> vipList = new ArrayList<>();
    private static List<CommonUser> userList = new ArrayList<>();

    /**
     * 發訊息給某人
     * @param from
     * @param message
     * @param to
     */
    @Override
    public void send(String message, String from, Messenger to) {
        for(Messenger messenger:vipList) {
            if(messenger.getName().equals(to.getName())) {
                System.out.println(from + " -> " + to.getName() + ": " + message);
            }
        }
//        System.out.println(from + " -> " + to.getName() + ": " + message);

        for (Messenger messenger:userList) {
            if(messenger.getName().equals(to.getName())) {
                System.out.println(from + " -> " + to.getName() + ": " + message);
            }
        }
//        System.out.println(from + " -> " + to.getName() + ": " + message);
    }

    /**
     * 發訊息給每個人
     * @param from
     * @param message
     */
    @Override
    public void sendToAll(String from, String message) {
        for (Messenger messenger:vipList) {
            if(!messenger.getName().equals(from)) {
                System.out.println(from + " -> " + messenger.getName() + ": " + message);
            }
        }

        for (Messenger messenger:userList) {
            if(!messenger.getName().equals(from)) {
                System.out.println(from + " -> " + messenger.getName() + ": " + message);
            }
        }
    }

    public static void joinChat(Messenger messenger) {
        if(messenger.getClass().getSimpleName().equals("VIPUser")) {
            vipList.add((VIPUser) messenger);
        } else {
            userList.add((CommonUser) messenger);
        }
    }
}
