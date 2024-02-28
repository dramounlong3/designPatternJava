package src.ch23_visitor.chef;

/**
 * 黑暗料理界廚師 - 被操作的物件
 */
public class DarkChef extends Chef{
    public DarkChef(String name) {
        super(name);
    }

    /**
     * 廚師如何實現做料理的工作交由visitor
     * @param vistor
     */
    @Override
    public void accept(Visitor vistor) {
        vistor.cook(this);
    }
}
