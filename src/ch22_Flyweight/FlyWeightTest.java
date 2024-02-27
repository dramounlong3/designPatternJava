package src.ch22_Flyweight;

import org.junit.jupiter.api.Test;
import src.ch22_Flyweight.tree.Tree;
import src.ch22_Flyweight.tree.TreeManager;

public class FlyWeightTest {

    @Test
    public void test() {
        System.out.println("==========蠅量級模式測試==========");

        Tree rose = TreeManager.getTree("玫瑰");  //getTree會回傳new Tree(type), 且如果玫瑰已經存在就不用再次新增, 會回傳同一棵玫瑰(物件)
        rose.setOwner("Rose Owner");    //設定認養擁有者為Rose
        rose.display();

        System.out.println();

        System.out.println("Jacky來認養一顆玫瑰花");
        Tree jRose = TreeManager.getTree("玫瑰");
        jRose.setOwner("Jacky");
        jRose.display();
        System.out.println("##Jacky買玫瑰花, 是買到先前Rose認養的那一顆, 因為同一時間同一棵樹只會開放一個人來看自己認養的樹, 所以不會有人發現這棵樹同時也被別人認養");

        System.out.println();

        Tree hinoki = TreeManager.getTree("台灣紅檜");
        hinoki.setOwner("林務局");
        hinoki.display();
    }
}
