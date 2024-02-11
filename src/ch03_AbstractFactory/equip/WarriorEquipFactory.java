package src.ch03_AbstractFactory.equip;


//鬥士裝備工廠
public class WarriorEquipFactory implements  EquipFactory{

    @Override
    public Weapon productWeapon() {
        //建立鬥士長劍
        LongSword longSword = new LongSword();
        //設定攻擊力
        longSword.setAtk(10);
        //設定攻擊範圍
        longSword.setRange(1);
        return longSword;
    }

    @Override
    public Clothes productArmor() {
        //建立鬥士盔甲
        Armor armor = new Armor();
        //設定防禦力
        armor.setDef(10);
        return armor;
    }
}
