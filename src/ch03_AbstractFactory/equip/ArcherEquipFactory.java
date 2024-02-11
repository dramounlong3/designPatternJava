package src.ch03_AbstractFactory.equip;

public class ArcherEquipFactory implements EquipFactory{
    @Override
    public Weapon productWeapon() {
        Bow bow = new Bow();    //建立弓箭手武器
        bow.setAtk(1);          //設定攻擊立
        bow.setRange(10);       //設定攻擊範圍
        return bow;
    }

    @Override
    public Clothes productArmor() {
        Leather leather = new Leather();    //建立弓箭手防具
        leather.setDef(5);                  //設定防禦力
        return leather;
    }
}
