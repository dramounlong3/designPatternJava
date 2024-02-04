package src.ch01_SimpleFactoryDesign;

import org.junit.jupiter.api.Test;
import src.ch01_SimpleFactoryDesign.village.Adventure;
import src.ch01_SimpleFactoryDesign.village.TrainingCamp;

import static org.junit.jupiter.api.Assertions.*;


public class TrainingCampArcherTest {
    @Test
    public void test() {
        //簡單工廠模式將建造實體(adventure)的控制權交給工廠執行
        //外圍程式只告訴工廠我需要建造什麼實體, 以利降低外圍程式和adventure的耦合度
        //但此情況如果要在工廠裡面增加一個職業, 就會動到TrainingCamp的程式碼, 有可能會改壞其他職業的建造流程
        System.out.println("==========簡單工廠模式測試==========");
        TrainingCamp trainingCamp = new TrainingCamp(); //創建工廠的實體
        Adventure memberA = trainingCamp.trainAdventure("archer");  //傳遞參數給工廠的方法, 建造所需的實體
        Adventure memberB = trainingCamp.trainAdventure("warrior"); //傳遞參數給工廠的方法, 建造所需的實體
        assertEquals("Archer", memberA.getType());
        assertEquals("Warrior", memberB.getType());
    }
}
