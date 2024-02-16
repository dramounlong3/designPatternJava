package src.ch16_ChainOfResponsibility.chain;

public abstract class Manager {

    protected String name;
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void apply(ApplyRequest applyRequest);
}
