package src.ch01_SimpleFactoryDesign.village;

public class Archer implements Adventure{

    public String getType() {
        System.out.println("我是弓箭手");
        return this.getClass().getSimpleName(); //回傳類別名稱 Archer
    }
}
