package src.ch06_Observer;

import org.junit.jupiter.api.Test;
import src.ch06_Observer.association.*;

public class AssociationTest {

    @Test
    public void test() {
        //Subject定義抽象發佈,   Association實作發佈         ====> 作為發佈者
        //Adventure定義抽象訂閱, 冒險者 實作訂閱觸發後的對應行為  ====> 作為訂閱者
        System.out.println("==========觀察者模式測試==========");
        //建立冒險者
        Adventure lancerJacky = new Lancer("Jacky");
        Adventure lancerAdam = new Lancer("Adam");
        Adventure gunmanTitan = new Gunman("Titan");
        Adventure BardPaul = new Bard("Paul");

        //建立公會, 並將所有冒險者加入承接任務清單中
        Association association = new Association();
        association.add(lancerJacky);
        association.add(lancerAdam);
        association.add(gunmanTitan);
        association.add(BardPaul);

        //發佈簡單任務
        System.out.println("派發簡單任務: run");
        association.sendMission("run");

        System.out.println();

        //發佈困難任務
        System.out.println("派發困難任務: this mission is more difficult");
        association.sendMission("this mission is more difficult");

        System.out.println();

        //lancerAdam不想參予任務了
        System.out.println("Adam不想接任務了, 所以退出公會接任務清單");
        association.remove(lancerAdam);
        //發佈困難任務
        System.out.println("再次派發困難任務: this mission is more difficult");
        association.sendMission("this mission is more difficult");



    }
}
