package src.ch05_Decorator.title;

public class Lancer implements Adventure{

    private String name;

    public Lancer(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("長槍攻擊by " + this.name);
    }
}
