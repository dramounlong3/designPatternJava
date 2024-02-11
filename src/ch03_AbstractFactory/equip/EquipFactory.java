package src.ch03_AbstractFactory.equip;

public interface EquipFactory {

    //生產武器
    Weapon productWeapon();

    //生產防具
    Clothes productArmor();

}
