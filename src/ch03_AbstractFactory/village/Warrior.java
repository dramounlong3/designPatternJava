package src.ch03_AbstractFactory.village;

import lombok.Data;

@Data
public class Warrior extends Adventure {

    @Override
    public String getType() {
        System.out.println("我是鬥士");
        return this.getClass().getSimpleName(); //回傳類別名稱 Warrior
    }

    @Override
    public void display() {
        System.out.println("我是鬥士，裝備: ");
        this.weapon.display(); //武器
        this.clothes.display();  //防具

    }
}
