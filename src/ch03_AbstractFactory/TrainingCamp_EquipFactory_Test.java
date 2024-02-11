package src.ch03_AbstractFactory;

import org.junit.jupiter.api.Test;
import src.ch03_AbstractFactory.village.Adventure;
import src.ch03_AbstractFactory.village.TrainingCampArcher;
import src.ch03_AbstractFactory.village.TrainingCampWarrior;
import src.ch03_AbstractFactory.equip.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TrainingCamp_EquipFactory_Test {

    @Test
    public void test() {
        //為了避免ch01簡單工廠新增職業動到既有程式的問題, 所以將TrainingCamp提升為一個抽象概念
        //當需要新增職業時, 就只要額外新增class(xxxTrainingCamp)去實作即可
        System.out.println("==========工廠模式==========");
        TrainingCampArcher trainingCampArcher = new TrainingCampArcher();    //建立弓箭手工廠
        Adventure archer = trainingCampArcher.trainAdventure();              //透過弓箭手工廠的訓練方法 生產弓箭手
        TrainingCampWarrior trainingCampWarrior = new TrainingCampWarrior(); //建立鬥士工廠
        Adventure warrior = trainingCampWarrior.trainAdventure();             //透過鬥士工廠的訓練方法   生產鬥士

        //檢測生產冒險者是否正確
        assertEquals("Archer", archer.getType());
        assertEquals("Warrior", warrior.getType());


        System.out.println("==========抽象工廠模式==========");
        //測試冒險者對應的裝備, xxxEquipFactory 生產
        //鬥士裝備
        EquipFactory warriorEquipFactory = new WarriorEquipFactory();
        Weapon longSword = warriorEquipFactory.productWeapon();    //此方法已經定義好會生產一把長劍 並設定對應素質
        Clothes armor = warriorEquipFactory.productArmor();        //此方法已經定義會生產一個盔甲 並設定對應素質
        //弓箭手裝備
        EquipFactory archerEquipFactory = new ArcherEquipFactory();
        Weapon bow = archerEquipFactory.productWeapon();          //此方法已經定義好會生產一把弓 並設定對應素質
        Clothes leather = archerEquipFactory.productArmor();      //此方法已經設定好會生產一個皮衣 並設定對應素質

        //檢測生產裝備是否正確
        assertEquals(10,longSword.getAtk());
        assertEquals(1,longSword.getRange());
        assertEquals(10,armor.getDef());

        assertEquals(1,bow.getAtk());
        assertEquals(10,bow.getRange());
        assertEquals(5,leather.getDef());

        archer.display();
        warrior.display();

    }
}
