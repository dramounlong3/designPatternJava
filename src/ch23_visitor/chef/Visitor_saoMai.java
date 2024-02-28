package src.ch23_visitor.chef;

/**
 * 指定做燒賣
 */
public class Visitor_saoMai implements Visitor{
    @Override
    public void cook(DarkChef darkChef) {
        System.out.println(darkChef.getName() + " : 魔幻鴉片燒賣");
    }

    @Override
    public void cook(SuperChef superChef) {
        System.out.println(superChef.getName() + " : 宇宙大燒賣");
    }

    @Override
    public void cook(SuperNoodleChef superNoodleChef) {
        System.out.println(superNoodleChef.getName() + " : 鐵桿燒賣");
    }

    @Override
    public void cook(NobodyChef nobodyChef) {
        System.out.println(nobodyChef.getName() + " : 路人甲燒賣");
    }
}
