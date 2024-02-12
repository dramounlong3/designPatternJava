package src.ch07_Command.coffeeShop;

/**
 * 點心廚師 (Concrete Receiver)
 */
public class Chef implements KitchenWorker{
    @Override
    public void finishOrder() {
        System.out.println("取出麵包 -> 美乃滋塗上麵包 -> 丟進烤箱 -> 灑上可以吃的裝飾 -> 點心完成");
        System.out.println();
    }
}
