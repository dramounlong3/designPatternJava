package src.ch03_AbstractFactory.village;

import lombok.Data;

@Data
public class Archer extends Adventure {

    @Override
    public String getType() {
        System.out.println("我是弓箭手");
        return this.getClass().getSimpleName(); //回傳類別名稱 Archer
    }

    @Override
    public void display() {
        System.out.println("我是弓箭手，裝備: ");
        this.weapon.display();//武器
        this.clothes.display(); //防具
    }

}
