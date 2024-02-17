package src.ch18_Mediator.chatRoom;

public class CommonUser extends Messenger{
    public CommonUser(String name) {
        super(name);
    }

    @Override
    public void sendToAll(String message) {
        System.out.println("非VIP用戶不能使用廣播");
    }
}
