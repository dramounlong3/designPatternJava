package src.ch01_SimpleFactoryDesign.village;

public class Warrior implements Adventure{
    public String getType() {
        System.out.println("我是鬥士");
        return this.getClass().getSimpleName(); //回傳類別名稱 Warrior
    }
}
