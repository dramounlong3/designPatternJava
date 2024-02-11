package src.ch05_Decorator.title;

public class Archer implements Adventure{

    private String name;

    public Archer(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("弓箭攻擊by " + this.name);
    }
}
