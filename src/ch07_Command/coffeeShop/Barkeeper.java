package src.ch07_Command.coffeeShop;

public class Barkeeper implements KitchenWorker{
    @Override
    public void finishOrder() {
        System.out.println("拿出杯子 -> 加滿冰塊 -> 把飲料倒進杯子 -> 飲料完成");
        System.out.println();
    }
}
