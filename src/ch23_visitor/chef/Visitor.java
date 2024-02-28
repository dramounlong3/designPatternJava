package src.ch23_visitor.chef;

/**
 * 指定的菜餚 - 拜訪者
 */
public interface Visitor {
    // 利用overload實現每一種廚師煮出不同的指定菜餚
    public void cook(DarkChef darkChef);
    public void cook(SuperChef superChef);
    public void cook(SuperNoodleChef superNoodleChef);
    void cook(NobodyChef nobodyChef);
}
