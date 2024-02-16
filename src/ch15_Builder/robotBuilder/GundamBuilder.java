package src.ch15_Builder.robotBuilder;

/**
 * 鋼彈建造者(ConcreteBuilder)
 */
public class GundamBuilder extends RobotBuilder{
    /**
     * 建造機器人外型
     * @return Form
     */
    @Override
    public Form buildForm() {
        // 類似使用工廠類別建造不同的外型
        return new Form("鋼彈");
    }

    /**
     * 建造機器人動力系統
     * @return Power
     */
    @Override
    public Power buildPower() {
        // 類似使用工廠類別建造不同的動力系統
        return new Power("亞哈反應爐","Beta發電機","氫電池");
    }

    /**
     * 建造機器人武器
     * @return Weapon
     */
    @Override
    public Weapon buildWeapon() {
        // 類似使用工廠類別建造不同的武器
        return new Weapon(
                new String[]{"60mm火神砲","突擊長矛","薩克機槍","光束劍"}
        );
    }
}
