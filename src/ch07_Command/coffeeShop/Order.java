package src.ch07_Command.coffeeShop;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Order {
    protected String name; //讓其他程式可以知道這是什麼訂單
    protected KitchenWorker receiver;

    public Order(KitchenWorker receiver) {
        this.receiver = receiver;
    }

    public void sendOrder() {
        this.receiver.finishOrder();
    }
}
