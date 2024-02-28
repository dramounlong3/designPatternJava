package src.ch23_visitor.chef;

public class NobodyChef extends Chef{
    public NobodyChef(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.cook(this);
    }
}
