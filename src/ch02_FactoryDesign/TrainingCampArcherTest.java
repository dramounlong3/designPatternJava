package src.ch02_FactoryDesign;

import org.junit.jupiter.api.Test;
import src.ch02_FactoryDesign.village.Adventure;
import src.ch02_FactoryDesign.village.TrainingCampArcher;
import src.ch02_FactoryDesign.village.TrainingCampWarrior;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TrainingCampArcherTest {
    @Test
    public void test() {
        //為了避免ch01簡單工廠新增職業動到既有程式的問題, 所以將TrainingCamp提升為一個抽象概念
        //當需要新增職業時, 就只要額外新增class(xxxTrainingCamp)去實作即可
        System.out.println("==========工廠模式==========");
        TrainingCampArcher trainingCampArcher = new TrainingCampArcher();    //建立弓箭手工廠
        Adventure archer = trainingCampArcher.trainAdventure();              //透過弓箭手工廠的訓練方法 生產弓箭手
        TrainingCampWarrior trainingCampWarrior = new TrainingCampWarrior(); //建立鬥士工廠
        Adventure warrior = trainingCampWarrior.trainAdventure();             //透過鬥士工廠的訓練方法   生產鬥士

        assertEquals("Archer",archer.getType());
        assertEquals("Warrior",warrior.getType());


    }
}
