package src.ch03_AbstractFactory.equip;

import lombok.Data;

//防具 - 上衣
@Data
public abstract class Clothes {

    //防禦
    protected int def;

    public void display() {
        System.out.println("  " + this.getClass().getSimpleName() + " def: " + this.def);
    }

}
