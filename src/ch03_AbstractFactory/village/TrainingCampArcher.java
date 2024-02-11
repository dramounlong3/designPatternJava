package src.ch03_AbstractFactory.village;

import src.ch03_AbstractFactory.equip.ArcherEquipFactory;
import src.ch03_AbstractFactory.equip.EquipFactory;

public class TrainingCampArcher implements TrainingCamp {

    private static EquipFactory factory = new ArcherEquipFactory();

    @Override
    public Adventure trainAdventure() {
        System.out.println("在弓箭手訓練營訓練一個弓箭手");
        Archer archer = new Archer();
        archer.setWeapon(factory.productWeapon()); //必須設定生產武器, 否則display時會是null
        archer.setClothes(factory.productArmor()); //必須設定生產防具, 否則display時會是null
        return archer;
    }
}
