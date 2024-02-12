package src.ch06_Observer.association;

public class Lancer extends Adventure{
    public Lancer(String name) {
        super(name);
    }

    @Override
    public void getMission(String mission) {
        System.out.println(this.name + ": 單來就接，沒在怕的!");
    }
}
