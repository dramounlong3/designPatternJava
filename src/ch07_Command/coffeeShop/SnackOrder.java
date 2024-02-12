package src.ch07_Command.coffeeShop;

/**
 * 點心訂單(Concrete Command)
 */

public class SnackOrder extends Order{
    //製作訂單的同時要將對應的廚房工作者放進來, 且要讓別人知道這是什麼訂單
    public SnackOrder(KitchenWorker kitchenWorker) {
        super(kitchenWorker);
        super.name = "snackOrder";
    }
}
