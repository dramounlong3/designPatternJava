package src.ch15_Builder.robotBuilder;

/**
 * 機器人建造器抽象類別(AbstractBuilder)
 */
public abstract class RobotBuilder {
    public abstract Form buildForm();       //建造外型
    public abstract Power buildPower();     //建造動力
    public abstract Weapon buildWeapon();   //建造武器
}
