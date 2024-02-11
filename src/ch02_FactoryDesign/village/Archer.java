package src.ch02_FactoryDesign.village;

public class Archer implements Adventure {

    @Override
    public String getType() {
        System.out.println("我是弓箭手");
        return this.getClass().getSimpleName(); //回傳類別名稱 Archer
    }
}
