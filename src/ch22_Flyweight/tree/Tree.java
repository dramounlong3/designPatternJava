package src.ch22_Flyweight.tree;

import lombok.Getter;
import lombok.Setter;

/**
 * 樹木(FlyWeight)
 */
@Getter
@Setter
public class Tree {
    private String type;    //樹種 (內部性質, 可以共享的資訊)
    private String owner;   //樹的擁有者 (外部性質，不能共享的資訊)

    //根據樹的種類建立物件
    public Tree(String type) {
        this.type = type;
        System.out.println("取得一顆新的 " + type);
    }

    public void display() {
        System.out.println(this.type + " , 擁有者: " + this.owner);
    }
}
