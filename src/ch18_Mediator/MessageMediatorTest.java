package src.ch18_Mediator;

import org.junit.jupiter.api.Test;
import src.ch18_Mediator.chatRoom.CommonUser;
import src.ch18_Mediator.chatRoom.MessageMediator;
import src.ch18_Mediator.chatRoom.Messenger;
import src.ch18_Mediator.chatRoom.VIPUser;

public class MessageMediatorTest {

    @Test
    public void test() {
        System.out.println("==========中介者模式測試==========");

        Messenger kyle = new VIPUser("kyle");
        Messenger grass = new CommonUser("grass");
        Messenger taylor = new CommonUser("taylor");

        //根據傳入的物件型態名稱, 決定要加到VIP list 或 Common list
        //join為靜態方法, 且VIP和Common list也皆為靜態變數, 讓每一次在使用時list的內容才會相同
        MessageMediator.joinChat(kyle);
        MessageMediator.joinChat(grass);
        MessageMediator.joinChat(taylor);

        System.out.println("VIP會員發訊息給每個人");

        kyle.sendToAll("Hi, 你好, 我是VIP會員!");

        System.out.println("傳私訊給某人");
        kyle.send("我是VIP會員", grass);
        taylor.send("我是一般會員", kyle);

        System.out.println("一般會員發訊息給每個人");
        //一般會員的類別有覆寫sendToAll, 所以Messenger grass = new CommonUser() call此方法時, 會優先使用CommonUser內的定義
        grass.sendToAll("我是一般會員, 想發訊息給每個人");

    }
}
