package src.ch15_Builder.robotBuilder;

/**
 * 指揮如何組裝機器人(Director)
 */
public class Director {
    private RobotBuilder robotBuilder;
    public Director(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    /**
     * Builder pattern的特色: 在Director內規範建造的順序
     * @return
     */
    public IRobot builderRobot() {
        IRobot robot = new Gundam();
        //按順序建造機器人
        robot.setForm(robotBuilder.buildForm());
        robot.setPower(robotBuilder.buildPower());
        robot.setWeapon(robotBuilder.buildWeapon());

        return robot;
    }
}
