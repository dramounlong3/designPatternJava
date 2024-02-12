package src.ch07_Command.coffeeShop;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Waitress {

    //服務生被建立的時候只剩下6個餐點可以點
    private Integer snackQty = 2;
    private Integer drinkQty = 4;

    List<Order> orderList = new ArrayList<>();

    public void setOrder(Order order) {
        if(order.name.equals("snackOrder") && this.snackQty <= 0) {
            System.out.println("點心賣完了");
        } else if(order.name.equals("snackOrder") && this.snackQty > 0) {
            System.out.println("增加點心訂單");
            this.snackQty--;
            this.orderList.add(order);
        } else if(order.name.equals("drinkOrder") && this.drinkQty <= 0) {
            System.out.println("飲料賣完了");
        } else if(order.name.equals("drinkOrder") && this.drinkQty > 0) {
            System.out.println("增加料訂單");
            this.drinkQty--;
            this.orderList.add(order);
        }
    }

    public void cancelOrder(Order order) {
        if(this.orderList == null || this.orderList.size() == 0) {
            System.out.println("目前沒有訂單, 無法取消餐點");
            return;
        }

        if(order.name.equals("snackOrder")) {
            this.snackQty++;
            System.out.println("取消一個點心訂單");
        }
        if(order.name.equals("drinkOrder")) {
            this.drinkQty++;
            System.out.println("取消一個飲料訂單");
        }

        this.orderList.remove(order);
    }

    //向廚房工作者送出訂單
    public void notifyWorker() {
        for (Order order:this.orderList) {
            order.sendOrder();
        }

        //送出訂單後要清空待點的order
        this.orderList.clear();
    }
}
