package src.ch23_visitor.chef;

/**
 * 特級廚師 - 被操作的物件
 */
public class SuperChef extends Chef{
    public SuperChef(String name) {
        super(name);
    }

    /**
     * 廚師如何實現做料理的工作交由visitor
     * @param vistor
     */
    @Override
    public void accept(Visitor vistor) {
        vistor.cook(this); //因為會將建立的物件型態同步傳過去, 所以在visitor會根據此型態執行對應的overload function
    }
}
