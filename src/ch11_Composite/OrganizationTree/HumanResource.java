package src.ch11_Composite.OrganizationTree;

/**
 * 人力資源部門(Leaf)
 */

public class HumanResource extends Department{

    public HumanResource(String name) {
        super(name);
    }

    /**
     * 部門實際的工作由子類別決定
     */
    @Override
    public void lineOfDuty() {
        System.out.println(this.name + ": 招募冒險者完成任務");
    }
}
