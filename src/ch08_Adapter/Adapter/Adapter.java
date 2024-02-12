package src.ch08_Adapter.Adapter;

/**
 * 轉接器(Adapter)
 * 將其他職業當作法師用
 */

public class Adapter implements Wizard {

    //本範例已經預設只有弓箭手會執行此轉接介面, 故只有預設弓箭手型態的成員
    private Archer archer;
    public Adapter(Archer archer) {
        this.archer = archer;
    }

    //透過implements Wizard介面, 達到弓箭手也可以轉為法師使用
    @Override
    public void fireBall() {
        System.out.print("在弓箭上包一層布 -> 淋上汽油 -> 點火...");
        this.archer.shot();
        System.out.println("代替的火球術飛出去了");
    }
}
