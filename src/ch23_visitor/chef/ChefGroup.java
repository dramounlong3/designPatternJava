package src.ch23_visitor.chef;

import java.util.ArrayList;
import java.util.List;

/**
 * 參加比賽的廚師(被操作的元素集合)
 */
public class ChefGroup {
    private List<Chef> list = new ArrayList<>();

    public void join(Chef chef) {
        list.add(chef);
    }

    public void leave(Chef chef) {
        list.remove(chef);
    }

    /**
     * 指定比賽題目, visitor為指定的比賽題目(每次傳進來可能為不同的比賽題目), 並且將每一位廚師透過accept的方法, 去透過自己的實作方式來做出指定的料理
     * @param visitor
     */
    public void topic(Visitor visitor) {
        for (Chef chef:list) {
            chef.accept(visitor);
        }
    }
}
