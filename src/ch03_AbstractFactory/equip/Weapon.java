package src.ch03_AbstractFactory.equip;

import lombok.Data;

//武器
@Data
public abstract class Weapon {

    //攻擊力
    protected int atk;
    //攻擊範圍
    protected int range;

    public void display() {
        System.out.println("  " + this.getClass().getSimpleName() + " atk: " + this.atk + ", range: " + this.range);
    }
}
