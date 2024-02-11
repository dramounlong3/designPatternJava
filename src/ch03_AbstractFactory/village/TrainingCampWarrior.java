package src.ch03_AbstractFactory.village;

import src.ch03_AbstractFactory.equip.EquipFactory;
import src.ch03_AbstractFactory.equip.WarriorEquipFactory;

public class TrainingCampWarrior {

    private static EquipFactory factory = new WarriorEquipFactory();

    public Adventure trainAdventure() {
        System.out.println("在鬥士訓練營訓練一個鬥士");
        Warrior warrior = new Warrior();
        warrior.setWeapon(factory.productWeapon()); //必須設定生產武器, 否則display時會是null
        warrior.setClothes(factory.productArmor()); //必須設定生產防具, 否則display時會是null
        return warrior;
    }
}
