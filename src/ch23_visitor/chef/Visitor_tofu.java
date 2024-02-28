package src.ch23_visitor.chef;

public class Visitor_tofu implements Visitor{
    @Override
    public void cook(DarkChef darkChef) {
        System.out.println(darkChef.getName() + " : 豆腐三重奏");
    }

    @Override
    public void cook(SuperChef superChef) {
        System.out.println(superChef.getName() + " : 熊貓豆腐");
    }

    @Override
    public void cook(SuperNoodleChef superNoodleChef) {
        System.out.println(superNoodleChef.getName() + " : 鐵桿臭豆腐");
    }

    @Override
    public void cook(NobodyChef nobodyChef) {
        System.out.println(nobodyChef.getName() + " : 路人甲豆腐");
    }
}
