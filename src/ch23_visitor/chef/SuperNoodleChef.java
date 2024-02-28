package src.ch23_visitor.chef;

/**
 * 特級麵點師傅 - 被操作的物件
 */
public class SuperNoodleChef extends Chef{
    public SuperNoodleChef(String name) {
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
