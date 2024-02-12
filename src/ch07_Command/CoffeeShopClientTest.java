package src.ch07_Command;

import org.junit.jupiter.api.Test;
import src.ch07_Command.coffeeShop.*;

public class CoffeeShopClientTest {

    @Test
    public void test() {
        System.out.println("==========命命模式測試==========");
        Chef snackChef = new Chef();                    //建立點心主廚
        Barkeeper barkeeper = new Barkeeper();          //建立調酒師
        Order snackOrder = new SnackOrder(snackChef);   //建立點心訂單, 並指定點心主廚作業
        Order drinkOder = new DrinkOrder(barkeeper);    //建立飲料訂單, 並指定調酒師作業
        Waitress waitress = new Waitress();             //建立服務生, 服務生會知道現在剩多少庫存

        System.out.println("點餐前的庫存量");
        System.out.println("點心庫存量: " + waitress.getSnackQty());
        System.out.println("飲料庫存量: " + waitress.getDrinkQty());

        System.out.println();

        System.out.println("客人點餐");
        waitress.setOrder(snackOrder);  //snackOrder會除了指定主廚外, 還有紀錄此份訂單式點心的訂單, 同時也會將點心庫存-1
        waitress.setOrder(snackOrder);
        waitress.setOrder(drinkOder);
        waitress.setOrder(drinkOder);
        waitress.setOrder(drinkOder);

        System.out.println();

        System.out.println("點餐後的庫存量");
        System.out.println("點心庫存量: " + waitress.getSnackQty());
        System.out.println("飲料庫存量: " + waitress.getDrinkQty());

        System.out.println("客人取消點心訂單*1");
        waitress.cancelOrder(snackOrder);

        System.out.println();

        System.out.println("取消後的庫存量");
        System.out.println("點心庫存量: " + waitress.getSnackQty());
        System.out.println("飲料庫存量: " + waitress.getDrinkQty());

        System.out.println();

        System.out.println("點餐完成, 通知廚房與調酒師");
        waitress.notifyWorker();

        System.out.println();

        System.out.println("通知完成後, 待點清單");
        System.out.println(waitress.getOrderList());

        System.out.println();

        System.out.println("測試點餐時庫存不足");
        waitress.setOrder(snackOrder); //1 -> 0
        waitress.setOrder(snackOrder); //不足

        System.out.println();

        System.out.println("測試訂單已經空了但又取消");
        System.out.println("剩餘清單數量: " + waitress.getOrderList().size());
        waitress.cancelOrder(snackOrder); // 1 -> 0
        waitress.cancelOrder(snackOrder); // 無清單


    }
}
