package src.ch11_Composite.OrganizationTree;

/**
 * 部門單位抽象類別(Leaf)
 */

public abstract class Department extends AbstractAssociation{
    public Department(String name) {
        super(name);
    }

    @Override
    public void add(AbstractAssociation association) {
        System.out.println("Leaf無法增加子節點");
    }

    @Override
    public void remove(AbstractAssociation association) {
        System.out.println("Leaf無子節點可刪除");
    }

    @Override
    public void display(Integer depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.name);
    }

    /**
     * 部門實際的工作疣子類別決定
     */
    @Override
    public abstract void lineOfDuty();
}
