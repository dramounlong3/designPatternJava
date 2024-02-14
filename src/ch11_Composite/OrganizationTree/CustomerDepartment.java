package src.ch11_Composite.OrganizationTree;

/**
 * 客服部門(Leaf)
 */

public class CustomerDepartment extends Department{

    public CustomerDepartment(String name) {
        super(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(this.name + ": 處理客訴");
    }
}
