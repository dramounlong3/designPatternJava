package src.ch02_FactoryDesign.village;

public class Warrior implements Adventure {

    @Override
    public String getType() {
        System.out.println("我是鬥士");
        return this.getClass().getSimpleName(); //回傳類別名稱 Warrior
    }
}
