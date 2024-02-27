package src.ch22_Flyweight.tree;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 樹種管理員(FlyWeight factory)
 */

@Getter
@Setter
public class TreeManager {

    private static Map<String, Tree> treePool = new HashMap<>();

    public static Tree getTree(String type) {
        //如果目前還沒有此樹種，新增一顆
        if(!treePool.containsKey(type)) {
            treePool.put(type, new Tree(type));
        }
        return treePool.get(type);
    }

}
