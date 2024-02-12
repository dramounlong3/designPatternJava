package src.ch06_Observer.association;

public abstract class Adventure {
    protected String name;

    public Adventure(String name) {
        this.name = name;
    }

    public abstract void getMission(String mission);
}
