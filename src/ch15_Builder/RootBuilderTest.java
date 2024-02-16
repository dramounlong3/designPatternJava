package src.ch15_Builder;

import org.junit.jupiter.api.Test;
import src.ch15_Builder.robotBuilder.Director;
import src.ch15_Builder.robotBuilder.GundamBuilder;
import src.ch15_Builder.robotBuilder.IRobot;

public class RootBuilderTest {

    @Test
    public void test() {
        System.out.println("==========建造者模式測試==========");
        Director director = new Director(new GundamBuilder());  //GundamBuilder內有三種建造方法
        IRobot robot = director.builderRobot();                 //透過定義好的builderRobot流程建造機器人, 最後統一定義實體機器人Gundam(型態為IRobot)
        robot.display();
    }
}
