package src.ch00_testSuper;

import org.junit.jupiter.api.Test;

public class SuperTest {

    @Test
    public void test() {

        /**
         * 若子類別採用super 則使用父類別的建構子 設定子類繼承的成員
         * 若子類別採用this.xxx = xxx 則使用子類別的建構子內容 設定子類別繼承的成員
         */

        System.out.println("執行ParentA parentA = new ParentA(\"kyle\");");
        ParentA parentA = new ParentA("kyle");
        System.out.println("parentA.name= " + parentA.name);

        System.out.println();

        System.out.println("ChildBSuper childBSuper = new ChildBSuper(\"kyle\");");
        ChildBSuper childBSuper = new ChildBSuper("kyle");
        System.out.println("childBSuper.name= " + childBSuper.name);

        System.out.println();

        System.out.println("ParentA parentA1 = new ChildBSuper(\"kyle\");");
        ParentA parentA1 = new ChildBSuper("kyle");
        System.out.println("parentA1.name= " + parentA1.name);

        System.out.println();

        System.out.println("ChildBNoSuper childBNoSuper = new ChildBNoSuper(\"kyle\");");
        ChildBNoSuper childBNoSuper = new ChildBNoSuper("kyle");
        System.out.println("childBNoSuper.name= " + childBNoSuper.name);

        System.out.println();

        System.out.println("ParentA parentA2 = new ChildBNoSuper(\"kyle\");");
        ParentA parentA2 = new ChildBNoSuper("kyle");
        System.out.println("parentA2.name= " + parentA2.name);

        System.out.println();
        System.out.println("ChildCSuper childCSuper = new ChildCSuper(\"kyle\");");
        System.out.println("ChildBSuper childBSuper1 = new ChildBSuper(childCSuper);");
        ChildCSuper childCSuper = new ChildCSuper("kyle");     //ChildCSuper是繼承ParentB
        ChildBSuper childBSuper1 = new ChildBSuper(childCSuper);    //將另一個物件當作參數丟進來測試 ChildBSuper是繼承ParentA
        System.out.println("childBSuper1.name= " + childBSuper1.name);
    }
}
