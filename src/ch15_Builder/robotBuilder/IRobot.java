package src.ch15_Builder.robotBuilder;

import lombok.Getter;
import lombok.Setter;

/**
 * 機器人介面(Product)
 */
@Getter
@Setter
public abstract class IRobot {
    Form form;      //外型
    Power power;    //動力
    Weapon weapon;  //武器

    /**
     * 展示機器人
     */
    public void display() {
        //會印出this.xxx.toString()的內容
        System.out.println("機器人外型: " + this.form);
        System.out.println("機器人動力: " + this.power);
        System.out.println("機器人武器: " + this.weapon);
    }
}
